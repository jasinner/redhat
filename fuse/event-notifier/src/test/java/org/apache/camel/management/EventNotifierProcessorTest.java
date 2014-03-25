/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.management;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import java.util.ListIterator;

import javax.naming.Context;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.management.event.ExchangeCreatedEvent;
import org.apache.camel.support.EventNotifierSupport;
import org.apache.camel.test.CamelTestSupport;
import org.apache.camel.util.jndi.JndiContext;

import com.redhat.gss.example.fuse.MyProducer;


/**
 * @version 
 */
public class EventNotifierProcessorTest extends CamelTestSupport {

    private static List<EventObject> events = new ArrayList<EventObject>();

    MyProducer producer = new MyProducer();
    
    @Override
    public void setUp() throws Exception {
        events.clear();
        super.setUp();
    }

    @Override
    protected CamelContext createCamelContext() throws Exception {
        DefaultCamelContext context = new DefaultCamelContext(createRegistry());
        context.getManagementStrategy().addEventNotifier(new EventNotifierSupport() {
            public void notify(EventObject event) throws Exception {
                events.add(event);
            }

            public boolean isEnabled(EventObject event) {
                if (event instanceof ExchangeCreatedEvent)
                	return true;
                return false;
            }

            @Override
            protected void doStart() throws Exception {
            }

            @Override
            protected void doStop() throws Exception {
            }
        });
        return context;
    }

    public void testExchangeDone() throws Exception {
        getMockEndpoint("mock:result").expectedMessageCount(1);

        template.sendBody("direct:start", "Hello World");

        assertMockEndpointsSatisfied();
        
        assertEquals(2, events.size());
        
        assertIsInstanceOf(ExchangeCreatedEvent.class, events.get(0));
        assertIsInstanceOf(ExchangeCreatedEvent.class, events.get(1));

    }


    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start").process(new Processor(){
                	public void process(Exchange exchange) throws Exception{
                		producer.send(exchange);
                	}
                });
            }
        };
    }

}