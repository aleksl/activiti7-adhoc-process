FROM openjdk:alpine
RUN apk --update add fontconfig ttf-dejavu
ENV PORT 8080
EXPOSE 8080
COPY target/*.jar /opt/app.jar
WORKDIR /opt
ENTRYPOINT exec java $JAVA_OPTS -agentlib:jdwp=transport=dt_socket,address=5006,server=y,suspend=n -jar app.jar