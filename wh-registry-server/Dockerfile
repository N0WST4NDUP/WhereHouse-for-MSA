FROM openjdk:17-alpine

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} wh-registry-server.jar

ENTRYPOINT ["java","-jar","/wh-registry-server.jar"]