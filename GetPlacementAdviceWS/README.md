get-payment-advise-ws: Example JAX-WS Web Service
==================================================
Author: Jason Shepherd
Technologies: JAX-WS  
Summary: Deployment of a basic JAX-WS Web service bundled in a WAR archive  
Target Product: EAP  
Product Versions: EAP 6.1, EAP 6.2, EAP 6.3  

What is it?
-----------

This example demonstrates the use of *JAX-WS* in Red Hat JBoss Enterprise Application Platform as a simple Hello World application.

System requirements
-------------------

The application this project produces is designed to be run on Red Hat JBoss Enterprise Application Platform 6.1 or later.

All you need to build this project is Java 6.0 (Java SDK 1.6) or later, Maven 3.0 or later.

 
Configure Maven
---------------

If you have not yet done so, you must [Configure Maven](https://github.com/jboss-developer/jboss-developer-shared-resources/blob/master/guides/CONFIGURE_MAVEN.md#configure-maven-to-build-and-deploy-the-quickstarts) before testing the quickstarts.


Generate the Webservice Stubs
----------------------

1. Open a command prompt and navigate to the root of the JBoss EAP directory.
2. Run the following command, replacing $PROJECT_HOME directory with the location of this project 

   bin/wsconsume.sh -k -s $PROJECT_HOME/src/main/java -p com.redhat.gss.example.ws -n $PROJECT_HOME/src/main/resources/PSL_CLM_GetPlacementAdvice_WS.WSDL

Start the JBoss EAP Server
----------------------         

1. Open a command prompt and navigate to the root of the JBoss EAP directory.
2. The following shows the command line to start the server:

        For Linux:   EAP_HOME/bin/standalone.sh
        For Windows: EAP_HOME\bin\standalone.bat


Build and Deploy the Quickstart
-------------------------

_NOTE: The following build command assumes you have configured your Maven user settings. If you have not, you must include Maven setting arguments on the command line. See [Build and Deploy the Quickstarts](../README.md#build-and-deploy-the-quickstarts) for complete instructions and additional options._

1. Make sure you have started the JBoss EAP server as described above.
2. Open a command prompt and navigate to the root directory of this quickstart.
3. Type this command to build and deploy the archive:

        mvn clean install jboss-as:deploy

4. This will deploy `target/get-payment-advise-ws.war` to the running instance of the server.

Access the application 
---------------------

You can check that the Web Service is running and deployed correctly by accessing the following URL: <http://localhost:8080/get-placement-advice-ws/GetPlacementAdviceService?wsdl>. This URL will display the deployed WSDL endpoint for the Web Service.


Undeploy the Archive
--------------------

1. Make sure you have started the JBoss EAP server as described above.
2. Open a command prompt and navigate to the root directory of this quickstart.
3. When you are finished testing, type this command to undeploy the archive:

        mvn jboss-as:undeploy


Run the Client Tests using Arquillian
-------------------------

This quickstart provides Arquillian tests. By default, these tests are configured to be skipped as Arquillian tests require the use of a container. 

_NOTE: The following commands assume you have configured your Maven user settings. If you have not, you must include Maven setting arguments on the command line. See [Run the Arquillian Tests](https://github.com/jboss-developer/jboss-developer-shared-resources/blob/master/guides/RUN_ARQUILLIAN_TESTS.md#run-the-arquillian-tests) for complete instructions and additional options._

1. Make sure you have started the JBoss EAP server as described above.
2. Open a command prompt and navigate to the root directory of this quickstart.
3. Type the following command to run the test goal with the following profile activated:

		mvn clean test -Parq-jbossas-remote


Investigate the Console Output
----------------------------

The following expected output should appear. The output shows what was said to the Web Service by the client and the responses it received.

   Running com.redhat.gss.example.ws.ClientArqTest
   [Client] Requesting the WebService
   [networkOptionChoice] networkOptionChoiceID
   Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.81 sec


Run the Quickstart in JBoss Developer Studio or Eclipse
-------------------------------------
You can also start the server and deploy the quickstarts from Eclipse using JBoss tools. For more information, see [Use JBoss Developer Studio or Eclipse to Run the Quickstarts](https://github.com/jboss-developer/jboss-developer-shared-resources/blob/master/guides/USE_JDBS.md#use-jboss-developer-studio-or-eclipse-to-run-the-quickstarts) 


Debug the Application
------------------------------------

If you want to debug the source code or look at the Javadocs of any library in the project, run either of the following commands to pull them into your local repository. The IDE should then detect them.

        mvn dependency:sources
        mvn dependency:resolve -Dclassifier=javadoc

