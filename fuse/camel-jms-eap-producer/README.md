iredhat
======
This repository is for case work for Red Hat Middleware Support Global Support Services clients.

To the extent possible under law, Red Hat, Inc. has dedicated all copyright to this software to the public domain worldwide, pursuant to the CC0 Public Domain Dedication. This software is distributed without any warranty.  See <http://creativecommons.org/publicdomain/zero/1.0/>.

An example of publishing to a remote ActiveMQ queue via the Resource Adapter

Prerequisites:
 - Setup the ActiveMQ resource adapter as specified here:
      https://access.redhat.com/site/documentation/en-US/Red_Hat_JBoss_A-MQ/6.1/html/Integrating_with_JBoss_Enterprise_Application_Platform/files/DeployRar-InstallRar.html

1. Build the project using 'mvn clean package'
2. Deploy to JBoss EAP 6.2.2 by copying the war from the target directory to EAP deployment directory.
3. Access the deployed application using http://localhost:8080/camel-jms-eap-producer-1.0.0/camel/tojms

Expected result:
A message is sent the 'queue://QueuePhysicalName' on the remote ActiveMQ instance


