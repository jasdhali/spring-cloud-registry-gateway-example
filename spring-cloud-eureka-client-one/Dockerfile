FROM maven:3.8.3-openjdk-17
VOLUME /tmp
ADD target/spring-cloud-eureka-client-one-1.0.0.jar app.jar
EXPOSE 8081
##ENTRYPOINT exec java -jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]