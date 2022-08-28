FROM gcr.io/distroless/java11-debian11

RUN groupadd -r -g 18080 spring && useradd --no-log-init -r -g spring -u 18080 spring

ENV APP_DIR=/usr/local/app
COPY ./build/libs /app
WORKDIR /app
CMD ["lottery-0.0.1-SNAPSHOT.jar"]

RUN chown -R 18080:18080 ${APP_DIR}
USER 18080:18080

EXPOSE 18080
