package com.recknerd.template.configuration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.security.SecurityProperties
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.web.util.matcher.AntPathRequestMatcher

@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    UserPassConfiguration userPassConfiguration

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        http.csrf().disable()
        http
            .authorizeRequests()
                .antMatchers('/webjars/**', '/css/**').permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                    .failureUrl('/login?error')
                    .defaultSuccessUrl('/')
                    .loginPage('/login')
                    .permitAll()
                .and()
                .logout()
                    .logoutRequestMatcher(new AntPathRequestMatcher('/logout'))
                    .logoutSuccessUrl('/login?logout')
                    .deleteCookies('remember-me')
                    .permitAll()
                .and()
                .rememberMe()
    }

    @Autowired
    void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser(userPassConfiguration.username)
                .password(userPassConfiguration.password)
                .roles('USER')
    }
}
