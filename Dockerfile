FROM eclipse-temurin:25-jdk-alpine
EXPOSE 8080
ADD target/api-rest-world.jar api-rest-world-new.jar
ENTRYPOINT ["java","-jar","/api-rest-world.jar"]

