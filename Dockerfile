FROM java:8
EXPOSE 8080:8080
ADD /target/docker-microservice-0.0.1-SNAPSHOT.jar docker-microservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","docker-microservice-0.0.1-SNAPSHOT.jar"]