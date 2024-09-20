FROM amazoncorretto:21

COPY target/db-persistence-0.0.1-SNAPSHOT.jar db-persistence.jar
ENTRYPOINT ["java", "-jar", "db-persistence.jar"]