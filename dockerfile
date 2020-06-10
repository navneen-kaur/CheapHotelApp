FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
MAINTAINER Navneen
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn package

FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/cheaphotelapp-0.0.1-SNAPSHOT.jar /app/
#ARG JAR_FILE=target/cheaphotelapp-0.0.1-SNAPSHOT.jar
#COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","cheaphotelapp-0.0.1-SNAPSHOT.jar"]