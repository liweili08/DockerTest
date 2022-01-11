FROM openjdk:17

MAINTAINER Liwei <liwei.li@rwth-aachen.de>

ADD target/DockerTest-0.0.1-SNAPSHOT.jar app.jar

CMD [ "sh", "-c", "java -jar /app.jar" ]