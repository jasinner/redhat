To the extent possible under law, Red Hat, Inc. has dedicated all copyright to this software to the public domain worldwide, pursuant to the CC0 Public Domain Dedication. This software is distributed without any warranty.  See <http://creativecommons.org/publicdomain/zero/1.0/>.

How to run:

1. build the package

   aggregator>mvn clean install

2. FuseESB:karaf@root>osgi:install -s fab:mvn:org.fusesource.examples/aggregator/7.1.0.fuse-047

3. Send some messages to the 'incomingOrder' queue.

4. Observe messages are received on 'aggregatedOrder' queue, even after stopping/starting route using JMX.
