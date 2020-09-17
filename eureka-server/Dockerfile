FROM maven:3.5-jdk-8-alpine

VOLUME /tmp

MAINTAINER mohkeita13@gmail.com

WORKDIR /app

ADD . /app


#RUN mvn package -DskipTests=true -Ddir=app

ADD target/eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar

EXPOSE 8761

ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar eureka-server.jar" ]