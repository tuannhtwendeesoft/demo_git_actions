FROM maven:3.8.3-openjdk-17
WORKDIR /app
COPY . .
RUN mvn clean package -Dmaven.test.skip
ENTRYPOINT ["java", "-jar", "target/testBuild.jar"]
EXPOSE 8081