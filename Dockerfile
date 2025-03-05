FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ecr.jar
ENTRYPOINT ["java", "-jar", "/ecr.jar"]
