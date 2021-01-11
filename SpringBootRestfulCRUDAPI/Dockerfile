FROM openjdk:8
ADD target/docker-crudAPI.jar docker-crudAPI.jar
EXPOSE 8055
ENTRYPOINT ["java","-jar","docker-crudAPI.jar"]