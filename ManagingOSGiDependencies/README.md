Managing OSGi Dependencies
==================================================
Author: Jason Shepherd
Technologies: OSGi 
Summary: Multi bundle deployment demonstrating how to manage dependecies between them with Import/Export Packages, and Services 
Target Product: Red Hat JBoss Fuse (Fuse)
Product Versions: Fuse 6.0, Fuse 6.1  

What is it?
-----------

This example demonstrates the use of *OSGi* in Red Hat JBoss Fuse

System requirements
-------------------

The application this project produces is designed to be run on Red Hat JBoss Fuse 6.0 or later

All you need to build this project is Java 7.0 (Java SDK 1.7) or later, Maven 3.0 or later.


Build and Install the Quickstart
-------------------------

1. Open a command prompt and navigate to the root directory of this quickstart.
2. Type this command to build and deploy the archive:

        mvn clean install

3. This will install all of the features into your local Maven repository

    For Linux or Mac:   ~/.m2/
    For Windows: "\Documents and Settings\USER_NAME\.m2\"  -or-  "\Users\USER_NAME\.m2\"

4. Start JBoss Fuse 6.1, which will drop you into the Karaf console once compleete

        $FUSE_HOME>bin/fuse

5. Install all the Utility, consumer, and provider bundles into JBoss Fuse 6.1, eg:

        install mvn:com.redhat.gss.example.osgi/time/1.0.0
        install mvn:com.redhat.gss.example.osgi/hello-paris-impl/1.0.0
        install mvn:com.redhat.gss.example.osgi/hello-boston/1.0.0

6. Install Client bundle into JBoss Fuse 6.1

        install mvn:com.redhat.gss.example.osgi/hello-client/1.0.0


Access the application 
---------------------

You can check that the dependencies resolve correctly using the 'resolve' command in the Karaf console:

        list | grep "Hello Consumer Bundle"
        resolve <hello-client-bundleId>

If you start the hello-client bundle now, it will go into 'GracePeriod', while it awaits it's dependent services hello-paris, and hello-boston

        start <hello-client-bundleId>
        list | grep "Hello"

Start the hello-paris, and hello-boston bundles using the 'start' command, observe that hello-client now consumes the hello-paris, and hello-boston services and prints 'hello' for both of those services

        list | grep "Hello Paris"
        start <hello-paris-bundleId>
        list | grep "Hello Boston"
        start <hello-boston-bundleId>

Boston says:Hello! at 22-4-2015 02:50:36 AM
Paris says:Bonjour! at 22-4-2015 08:50:36 AM

Undeploy the Archive
--------------------

1. Make sure you have started the JBoss Fuse as described above.
2. From the Karaf console execute the following commands
3. When you are finished testing, exit Jboss Fuse by typing 'exit'

        uninstall <time-bundleID>
        uninstall <hello-paris-bundleID>
        uninstall <hello-boston-bundleID>
        uninstall <hello-client-bundleID>



