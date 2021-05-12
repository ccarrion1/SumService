FROM openjdk:8u131-jdk-alpine

EXPOSE 9090

WORKDIR /usr/local/bin/

COPY target/sum-service-1.0.1-SNAPSHOT.jar sum-service.jar

CMD ["java", "-jar", "sum-service.jar"]
