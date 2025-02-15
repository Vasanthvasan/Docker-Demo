FROM openjdk:23-jdk
COPY target/docker-demo.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","/docker-demo.jar"]