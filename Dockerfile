FROM openjdk:11
COPY ./target/account-0.0.1-SNAPSHOT.jar account-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","account-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081
