package com.recknerd.template.configuration

import groovy.util.logging.Slf4j
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = 'credentials')
@Slf4j
class UserPassConfiguration {

    String username
    String password
}
