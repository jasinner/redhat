package com.redhat.gss.example.camel.client;

import org.apache.camel.test.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProxyWithCxfRouteBuilderTest extends CamelSpringTestSupport{
	
    @Test
    public void test1() throws Exception {
        template.sendBody("direct-vm:ComS_WS", "1");

        // we must have a exception if the proxy address does not correspond to a proxy
    }

	@Override
	protected AbstractApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
	}

}
