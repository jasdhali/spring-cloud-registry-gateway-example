FROM maven:3.8.3-openjdk-17
VOLUME /tmp
ADD target/spring-cloud-eureka-registry-server-1.0.0.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/app.jar"]