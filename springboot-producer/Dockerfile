FROM java:8-jdk-alpine

COPY ./target/springboot-producer.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch springboot-producer.jar'

ENTRYPOINT ["java","-jar","springboot-producer.jar"]