FROM openjdk:11
RUN addgroup spring && adduser spring --ingroup spring --disabled-password --no-create-home
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
