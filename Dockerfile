FROM maven:3.8.3-openjdk-17
WORKDIR /app
COPY . .
RUN mvn clean package
ENTRYPOINT ["java", "-jar", "target/testBuild.jar"]
EXPOSE 8081