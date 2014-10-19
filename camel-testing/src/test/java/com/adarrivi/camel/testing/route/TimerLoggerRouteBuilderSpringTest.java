package com.adarrivi.camel.testing.route;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adarrivi.camel.testing.config.TimerLoggerRouteContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TimerLoggerRouteContext.class })
public class TimerLoggerRouteBuilderSpringTest {

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(TimeUnit.SECONDS.toMillis(5));
	}

}
