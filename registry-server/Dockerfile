FROM openjdk:17-alpine

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} registry-server.jar

ENTRYPOINT ["java","-jar","/registry-server.jar"]