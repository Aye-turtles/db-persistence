FROM openjdk:21

COPY db-persistence-0.0.1-SNAPSHOT.jar /usr/src/app/db-persistence-0.0.1-SNAPSHOT.jar
EXPOSE 8090
CMD ["java", "-jar", "/usr/src/app/act8.jar"]
