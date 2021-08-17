FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8080
ADD target/demodocker.jar demodocker.jar
ENTRYPOINT ["java","-jar","/demodocker.jar"]