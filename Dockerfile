## Build stage
FROM maven:3.9.9-eclipse-temurin-21-alpine AS build
WORKDIR /home/maven
COPY . .
RUN mvn clean package -DskipTests

## Package stage
FROM openjdk:21-jdk-slim
RUN mkdir /app
COPY --from=build /home/maven/target/*.jar /app/liquibase-k8s-0.0.1.jar

ENV PORT=9090
ENV DB_URL='jdbc:postgresql://host.docker.internal:5432/liquiDb'
ENV DB_USER='pg'
ENV DB_PASS='pg'

ENTRYPOINT ["java", "-jar", "/app/liquibase-k8s-0.0.1.jar"]