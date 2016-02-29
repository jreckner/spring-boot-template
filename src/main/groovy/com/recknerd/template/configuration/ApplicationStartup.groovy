package com.recknerd.template.configuration

import groovy.util.logging.Slf4j
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component

@Component
@Slf4j
class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {

    /*
     * This method is called during Spring's startup.
     *
     * @param event Event raised when an ApplicationContext gets initialized or
     * refreshed.
     */
    @Override
    void onApplicationEvent(final ContextRefreshedEvent event) {
    }

}
