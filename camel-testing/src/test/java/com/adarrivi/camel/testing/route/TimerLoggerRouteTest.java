package com.adarrivi.camel.testing.route;

import java.util.concurrent.TimeUnit;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

// Old style version test, creating the route manually. No spring support here
public class TimerLoggerRouteTest extends CamelTestSupport {

	@Override
	protected RouteBuilder createRouteBuilder() throws Exception {
		TimerLoggerRouteBuilder routeBuilder = new TimerLoggerRouteBuilder();
		return routeBuilder;
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(TimeUnit.SECONDS.toMillis(5));
	}

}
