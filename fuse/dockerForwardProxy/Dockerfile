FROM fedora:20
RUN yum install -y httpd
ADD proxy.conf /etc/httpd/conf.d/proxy.conf
EXPOSE 9001
CMD /usr/sbin/httpd && tail -F /etc/httpd/logs/access_log
