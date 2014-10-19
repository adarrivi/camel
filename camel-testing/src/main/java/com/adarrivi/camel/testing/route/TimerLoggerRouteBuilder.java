package com.adarrivi.camel.testing.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TimerLoggerRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer:logMessageTimer?period=1s").log(
				"Event triggered by ${property.CamelTimerName}"
						+ " at ${header.CamelTimerFiredTime}");

	}

}
