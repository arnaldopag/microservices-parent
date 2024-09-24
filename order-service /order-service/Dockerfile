FROM openjdk:17
LABEL name="order-service"
ADD /target/order-service.jar order.jar
ENTRYPOINT ["java", "-jar", "order.jar"]