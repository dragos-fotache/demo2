FROM openjdk:16-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/demo2-0.0.1-SNAPSHOT.jar demo2.jar
# EXPOSE 8181
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar demo2.jar
