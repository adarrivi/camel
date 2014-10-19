package com.adarrivi.camel.testing.config;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.javaconfig.SingleRouteCamelConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.adarrivi.camel.testing.route.DirectLoggerRoute;

@Configuration
@ComponentScan(basePackages = { "com.adarrivi.camel.testing.route", "com.adarrivi.camel.testing.processor" })
public class DirectLoggerContext extends SingleRouteCamelConfiguration {

    @Autowired
    private DirectLoggerRoute directLoggerRoute;

    @Override
    public RouteBuilder route() {
        return directLoggerRoute;
    }
}
