FROM amazoncorretto:20
MAINTAINER ivk
COPY target/ivk-0.0.1-SNAPSHOT.jar ivk-app.jar
ENTRYPOINT ["java","-jar","/ivk-app.jar"]
