FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY
EXPOSE 80
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
COPY ${DEPENDENCY}/entrypoint.sh /
RUN apk update
RUN apk add bash
RUN apk add curl
RUN chmod +x /entrypoint.sh
ENTRYPOINT ["/bin/bash", "/entrypoint.sh", "default"]
