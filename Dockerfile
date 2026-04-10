# Use correct Java 21 image
FROM eclipse-temurin:21-jdk-jammy

# Copy JAR from your folder
COPY luffy-banks/target/*.jar app.jar

# Run application
ENTRYPOINT ["java","-jar","/app.jar"]