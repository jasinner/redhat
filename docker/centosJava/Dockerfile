FROM centos
MAINTAINER Jason Shepherd <jshepher@redhat.com>
RUN curl http://repos.fedorapeople.org/repos/dchen/apache-maven/epel-apache-maven.repo > /etc/yum.repos.d/epal-apache-maven.repo
RUN yum install --assumeyes centos-release-SCL && ( \
     echo "update"; \
     echo "install java-1.7.0-openjdk"; \
     echo "install apache-maven"; \
     echo "run" ) | yum shell --assumeyes && yum clean all --assumeyes
#Download and install Maven from http://mirror.ventraip.net.au/apache/maven/maven-3/3.2.1/binaries/apache-maven-3.2.1-bin.tar.gz
#Pull Karaf source code from ssh://git@forge.fusesource.com/karaf.git
#Build it with mvn -Pfastinstall
