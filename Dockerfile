# Stage 1: Build the application using Maven
FROM maven:3.8.1-openjdk-17 AS build

WORKDIR /app
COPY . /app

# Build the app
RUN mvn clean package -DskipTests


# Use OpenJDK 17 as the base image for building
FROM openjdk:17-jdk-alpine AS build

# Set the working directory
WORKDIR /app

# Copy the local project files to the container
COPY . /app

# Build the application using Maven
RUN mvn clean package -DskipTests

# Use a smaller JDK image for runtime (lighter)
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /opt/quarkus

# Copy the JAR file generated in the build stage (including version suffix)
COPY --from=build /app/target/quarkus-random-generator-*.jar /opt/quarkus/quarkus-random-generator.jar

# Expose the port Quarkus is running on (8080 is the default)
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "/opt/quarkus/quarkus-random-generator.jar"]