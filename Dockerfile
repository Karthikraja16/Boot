FROM eclipse-temurin:17-jdk
COPY target/boot.jar boot.jar
CMD [ "java","-jar","boot.jar" ]