FROM openjdk:8-jdk-alpine
COPY target/git-package-registry-0.0.1-SNAPSHOT.jar git-package-demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "git-package-demo.jar"]