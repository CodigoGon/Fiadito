FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/Fiadito-0.0.1.jar
COPY ${JAR_FILE} app_Fiadito.jar
ENTRYPOINT ["java","-jar","app_Fiadito.jar"]