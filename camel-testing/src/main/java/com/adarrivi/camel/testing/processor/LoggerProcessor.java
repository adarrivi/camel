package com.adarrivi.camel.testing.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("loggerProcessor")
class LoggerProcessor implements Processor {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerProcessor.class);

    LoggerProcessor() {
        // Limiting scope
    }

    @Override
    public void process(Exchange exchange) throws Exception {
        LOGGER.debug("Logging message: {}", getAsString(exchange.getIn().getBody()));
    }

    private String getAsString(Object object) {
        if (object == null) {
            return "null";
        }
        return object.toString();
    }

}
