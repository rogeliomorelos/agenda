FROM openjdk:11-jdk
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","-Dspring.datasource.url=${URL}","-Dspring.profiles.active=${PROFILE}","-Dspring.datasource.username=${USER}","-Dspring.datasource.password=${PASSWORD}","/app.jar"]