package com.adarrivi.camel.testing.direct;

import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class DirectMessageContentTest extends CamelTestSupport {

	private static final String FROM_ENDPOINT = "direct:in";

	@Produce(uri = FROM_ENDPOINT)
	private ProducerTemplate producerTemplate;

	@EndpointInject(uri = "mock:out")
	private MockEndpoint mockOut;

	@Override
	protected RouteBuilder createRouteBuilder() throws Exception {
		DirectMessageContentFilterRoute routeBuilder = new DirectMessageContentFilterRoute();
		routeBuilder.setSourceUri(FROM_ENDPOINT);
		routeBuilder.setTargetUri("mock:out");
		return routeBuilder;
	}

	@Test
	public void test() {
		producerTemplate.sendBody(FROM_ENDPOINT, "A Camel");
		producerTemplate.sendBody(FROM_ENDPOINT, "A HighCamel");
		producerTemplate.sendBody(FROM_ENDPOINT, "An Elephant");
	}

}
