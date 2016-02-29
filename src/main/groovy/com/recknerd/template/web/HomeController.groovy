package com.recknerd.template.web

import groovy.util.logging.Slf4j
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@Controller
@Slf4j
class HomeController extends WebMvcConfigurerAdapter {

    @RequestMapping('/')
    def index() {
        return 'index'
    }

    @Override
    void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController('/login').setViewName('login')
    }

}
