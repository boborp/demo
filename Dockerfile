# Start with a base image containing Java runtime (mine java 8)
FROM amazoncorretto:11
# Add Maintainer Info
LABEL maintainer="robert.polak@monster.com"
# Add a volume pointing to /tmp
VOLUME /tmp
#VOLUME D:\\docker_workspace
# Make port 8080 available to the world outside this container
EXPOSE 8080
# The application's jar file (when packaged)
ARG JAR_FILE=out/artifacts/demo_jar/demo.jar
# Add the application's jar to the container
#COPY target/kube-demo-0.0.1-SNAPSHOT.jar app.jar
ADD ${JAR_FILE} demo.jar
# Run the jar file
ENTRYPOINT ["java","-jar","/demo.jar"]