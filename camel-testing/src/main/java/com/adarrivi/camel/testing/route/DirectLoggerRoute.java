package com.adarrivi.camel.testing.route;

import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DirectLoggerRoute extends RouteBuilder {

    public static final String FROM_URI = "direct:in";
    @Autowired
    private Processor loggerProcessor;

    @Override
    public void configure() throws Exception {
        from(FROM_URI).process(loggerProcessor);
    }

}
