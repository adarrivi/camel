package com.adarrivi.camel.testing.config;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.javaconfig.SingleRouteCamelConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.adarrivi.camel.testing.route.TimerLoggerRouteBuilder;

@Configuration
@ComponentScan(basePackages = { "com.adarrivi.camel.testing.route" })
public class TimerLoggerRouteContext extends SingleRouteCamelConfiguration {

	@Autowired
	private TimerLoggerRouteBuilder timerLoggerRouteBuilder;

	@Override
	public RouteBuilder route() {
		return timerLoggerRouteBuilder;
	}
}
