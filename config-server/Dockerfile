FROM openjdk:17-alpine

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} config-server.jar

ENTRYPOINT ["java","-jar","/config-server.jar"]