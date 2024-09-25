FROM openjdk:17
LABEL name = "invetory-service"
ADD /target/inventory-service.jar inventory.jar
ENTRYPOINT ["java","-jar","inventory.jar"]