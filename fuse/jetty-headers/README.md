
## Prerequisites
Before building and running this example you need:

* Maven 3.0.3 or higher
* JDK 1.6 or 1.7
* JBoss Fuse 6

## Files in the Example
* `pom.xml` - the Maven POM file for building the example
* `src/main/java/org.jboss.fuse.examples/eip/RegionSupport.java` - a Java class used to determine the region code used by the recipient list
* `src/main/resources/OSGI-INF/blueprint/eip.xml` - the OSGI Blueprint file that defines the routes
* `test/data/orders.xml` - the data file that can be used to test the route
* `test/java/RegionSupportTest.java` - a JUnit test class for `RegionSupport`

## Building the Example
To build the example:

1. Change your working directory to the `examples/jetty-http` directory.
2. Run `mvn clean install` to build the example.

## Running the Example
To run the example:

1. Start JBoss Fuse 6 by running `bin/fuse` (on Linux) or `bin\fuse.bat` (on Windows).
2. In the JBoss Fuse console, enter the following command:
        osgi:install -s fab:mvn:org.jboss.fuse.examples/jetty-http/6.0.0.redhat-024
3. Send a request to the applicaiton 
        using curl -i http://localhost:8182/hello

