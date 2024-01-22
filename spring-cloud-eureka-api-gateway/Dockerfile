FROM maven:3.8.3-openjdk-17
VOLUME /tmp
ADD target/spring-cloud-eureka-api-gateway-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]