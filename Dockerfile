FROM openjdk:17-jdk-slim
ENV PORT 9192
EXPOSE 9192
CMD echo "networkaddress.cache.ttl=0" >> /usr/lib/jvm/java-17.0-openjdk-amd64/jre/lib/security/java.security
COPY target/demo-0.0.1-SNAPSHOT.jar /opt/
WORKDIR /opt
ENTRYPOINT ["sh","-c","java -Xmx3024m -Xms512m -jar demo-0.0.1-SNAPSHOT.jar"]
