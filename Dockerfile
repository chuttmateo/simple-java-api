FROM amazoncorretto:20-alpine3.18-jdk

WORKDIR /app
COPY . .
RUN apk update && \
    apk add maven
RUN mvn package

CMD ["java", "-jar", "target/simple-java-api-0.0.1-SNAPSHOT.jar"]