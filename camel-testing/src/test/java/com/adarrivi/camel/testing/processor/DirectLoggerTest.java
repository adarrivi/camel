package com.adarrivi.camel.testing.processor;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adarrivi.camel.testing.config.DirectLoggerContext;
import com.adarrivi.camel.testing.route.DirectLoggerRoute;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DirectLoggerContext.class })
public class DirectLoggerTest {

    @Produce(uri = DirectLoggerRoute.FROM_URI)
    private ProducerTemplate producerTemplate;

    @Autowired
    private DirectLoggerRoute directLoggerRoute;

    @Test
    public void test() {
        producerTemplate.sendBody(DirectLoggerRoute.FROM_URI, "A Camel");
        producerTemplate.sendBody(DirectLoggerRoute.FROM_URI, "A HighCamel");
        producerTemplate.sendBody(DirectLoggerRoute.FROM_URI, "An Elephant");
    }

}
