# base image: distroless
FROM gcr.io/distroless/java11-debian11

# set ENV
ENV APP_DIR=/usr/local/app

# set directory and jar to start app
COPY ./build/libs /app
WORKDIR /app
CMD ["lottery-0.0.1-SNAPSHOT.jar"]

# expose port
EXPOSE 18080
