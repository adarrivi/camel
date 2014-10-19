package com.adarrivi.camel.testing.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.ChoiceDefinition;

public class DirectMessageContentFilterRoute extends RouteBuilder {

	private String sourceUri;
	private String targetUri;

	public void setSourceUri(String sourceUri) {
		this.sourceUri = sourceUri;
	}

	public void setTargetUri(String targetUri) {
		this.targetUri = targetUri;
	}

	@Override
	public void configure() throws Exception {
		ChoiceDefinition choice = from(sourceUri).choice();
		choice = choice.when().simple("${body} contains 'Camel'")
				.log("Camel ${body}");
		choice.otherwise().log("Other ${body}").end().log("Message ${body}");
	}

}
