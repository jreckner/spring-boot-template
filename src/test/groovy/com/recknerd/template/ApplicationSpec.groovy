package com.recknerd.template

import org.springframework.boot.SpringApplication
import spock.lang.Specification

class ApplicationSpec extends Specification {

    Application cut = new Application()

    def "main starts spring application"() {
        setup:
        SpringApplication.metaClass.'static'.run = { }

        when:
        cut.main([] as String[])

        then:
        true
    }
}
