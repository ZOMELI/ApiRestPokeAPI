FROM openjdk:8
MAINTAINER zomeli.villanueva.com
COPY target/ApiRestPokeAPI-0.0.1-SNAPSHOT.jar docker-apirestpokeapi-0.0.1.jar
ENTRYPOINT ["java","-jar","/docker-apirestpokeapi-0.0.1.jar"]