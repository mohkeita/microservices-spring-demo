FROM maven:3.5-jdk-8-alpine

VOLUME /tmp

MAINTAINER Mohamed Keita <mohkeita13@gmail.com>

WORKDIR /app

ADD . /app

#RUN mvn package -DskipTests=true -Ddir=app

ADD target/customer-service-0.0.1-SNAPSHOT.jar customer-microservice.jar

EXPOSE 8181

ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar customer-microservice.jar" ]