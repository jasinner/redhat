This example demonstrates reading from a local ActiveMQ instance, and incrementing a counter. When the counter reaches a specified rollover target it returns true.

The example makes use of a camel content based router (http://camel.apache.org/content-based-router.html)

Make sure you set the brokerUrl equal to the broker name for the Fuse container "vm://amq?create=false".

You can overwrite the default properties by placing a file 'com.redhat.gss.example.fuse.amq.properties.cfg' in the Fuse 'etc' directory with the following contents:

fromQueue=event
rolloverCount=50

To Build the example:

   mvn clean install
   
To install the example:

   install -s mvn:com.redhat.gss.example.fuse.amq.properties/amqProperties/0.0.1-SNAPSHOT
   
To run the example:

   Send 50+ messages to a topic named 'event'
   
