FROM openjdk:8u121-jre-alpine
ADD target/soap-cliente-0.0.1-SNAPSHOT.jar soap-cliente-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /soap-cliente-0.0.1-SNAPSHOT.jar"]