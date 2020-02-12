FROM openjdk:8
WORKDIR /app
COPY --from=build /app/springboot-docker-web/target/sprintboot-docker-web.jar .
EXPOSE 8085 8080
CMD ["java","-jar","sprintboot-docker-web.jar"]
