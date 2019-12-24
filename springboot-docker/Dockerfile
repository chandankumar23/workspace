FROM alpine/git as clone
WORKDIR /app
RUN git clone -b test-dev-branch https://shekharlm@bitbucket.org/shekharlm/springboot-docker.git
RUN ls -l

FROM shekhar8161/eservecloud-base-image:latest as build
WORKDIR /app
COPY --from=clone /app/springboot-docker  /app
RUN ls -l
RUN mvn install

FROM openjdk:8
WORKDIR /app
COPY --from=build /app/springboot-docker-web/target/sprintboot-docker-web.jar .
EXPOSE 8085 8080
CMD ["java","-jar","sprintboot-docker-web.jar"]