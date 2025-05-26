# ✅ ARM64-compatible base image (works on all platforms)
FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/bookmanager-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
