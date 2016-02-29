package com.recknerd.template.configuration

import static com.google.common.base.Predicates.or
import static springfox.documentation.builders.PathSelectors.regex

import com.google.common.base.Predicate
import com.google.common.collect.Sets
import groovy.util.logging.Slf4j
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.http.MediaType
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket

@Configuration
@ConfigurationProperties(prefix = 'swagger')
@Slf4j
class SwaggerConfiguration {

    Boolean enabled
    String version
    String title
    String description
    String termsOfServiceUrl
    String contact
    String license
    String licenseUrl

    @Bean
    Docket seriesApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(enabled)
                .apiInfo(apiInfo())
                .select().paths(seriesPaths())
                .build()
                .produces(Sets.newHashSet(MediaType.APPLICATION_JSON_VALUE))
                .consumes(Sets.newHashSet(MediaType.APPLICATION_JSON_VALUE))
                .protocols(Sets.newHashSet('http'))
                .useDefaultResponseMessages(false)
                .ignoredParameterTypes(MetaClass)
    }

    private Predicate<String> seriesPaths() {
        return or(regex('/api/*'))
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder(
                title: title,
                description: description,
                termsOfServiceUrl: termsOfServiceUrl,
                contact: contact,
                license: license,
                licenseUrl: licenseUrl,
                version: version
        ).build()
    }
}