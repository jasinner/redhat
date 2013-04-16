package com.redhat.gss.example.fuse.amq;
/** 
* To the extent possible under law, Red Hat, Inc. has dedicated all copyright to this software to the public domain worldwide, 
* pursuant to the CC0 Public Domain Dedication. This software is distributed without any warranty.  
* See <http://creativecommons.org/publicdomain/zero/1.0/>.
 */
import java.util.Date;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.util.IndentPrinter;

/**
 * A simple tool for publishing messages
 * 
 * 
 */
public class Producer{

    private Destination destination;
    private int messageCount = 10;
    private boolean verbose = true;
    private int messageSize = 255;
    private String user = "admin";
    private String password = "admin";
    private String url = ActiveMQConnection.DEFAULT_BROKER_URL;
    private String subject = "TOOL.DEFAULT";
    private static Object lockResults = new Object();



    public static void main(String[] args){
    	Producer producer = new Producer();
    	producer.run();
    }
    
    public void run(){
        Connection connection = null;
        try {
            // Create the connection.
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(user, password, url);
            connection = connectionFactory.createConnection();
            connection.start();

            // Create the session
            Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
            destination = session.createTopic(subject); 

            // Create the producer.
            MessageProducer producer = session.createProducer(destination);

            // Start sending messages
            send(session, producer);

            System.out.println(" Done.");

            synchronized (lockResults) {
                ActiveMQConnection c = (ActiveMQConnection) connection;
                System.out.println("Results:\n");
                c.getConnectionStats().dump(new IndentPrinter());
            }

        } catch (Exception e) {
            System.out.println("Caught: " + e);
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Throwable ignore) {
            }
        }
    }

    protected void send(Session session, MessageProducer producer) throws Exception {

        for (int i = 0; i < messageCount || messageCount == 0; i++) {

            TextMessage message = session.createTextMessage(createMessageText(i));

            if (verbose) {
                String msg = message.getText();
                if (msg.length() > 50) {
                    msg = msg.substring(0, 50) + "...";
                }
                System.out.println("Sending message: " + msg + "'");
            }

            producer.send(message);
        }
    }

    private String createMessageText(int index) {
        StringBuffer buffer = new StringBuffer(messageSize);
        buffer.append("Message: " + index + " sent at: " + new Date());
        if (buffer.length() > messageSize) {
            return buffer.substring(0, messageSize);
        }
        for (int i = buffer.length(); i < messageSize; i++) {
            buffer.append(' ');
        }
        return buffer.toString();
    }


}
