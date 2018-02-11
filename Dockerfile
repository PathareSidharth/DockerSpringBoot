FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD /target/SpringBoot-1.0-SNAPSHOT.jar SpringBoot-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","SpringBoot-1.0-SNAPSHOT.jar"]
