FROM openjdk:8-jre-alpine
EXPOSE 8761
COPY ./target/registry-config-0.0.1-SNAPSHOT.jar registry-config-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "registry-config-0.0.1-SNAPSHOT.jar"]