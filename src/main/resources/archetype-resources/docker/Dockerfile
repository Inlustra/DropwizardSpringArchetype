FROM java:8-jre
MAINTAINER ${authorName} <${authorEmail}>

ADD ./start.sh /start.sh
ADD ["./*.jar", "/var/app/${artifactId}/${artifactId}.jar"]
ADD ["./configuration.yml", "/etc/${artifactId}/configuration.yml"]
VOLUME ["/var/log/${artifactId}"]
EXPOSE 8080 8081
RUN ["/bin/bash", "-c", "mkdir -p /var/log/${artifactId}"]
CMD ["/bin/bash", "/start.sh"]