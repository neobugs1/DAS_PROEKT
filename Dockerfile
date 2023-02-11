FROM openjdk:latest
ADD target/kiii-dians-docker.jar kiii-dians-docker.jar
ENTRYPOINT ["java", "-jar","kiii-dians-docker.jar"]
EXPOSE 8080