FROM maven:3.8.3-openjdk-17
VOLUME /tmp
ADD target/spring-cloud-eureka-client-two-1.0.0.jar app.jar
EXPOSE 8082
##ENTRYPOINT exec java -jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]