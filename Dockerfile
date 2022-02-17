FROM openjdk:8
ADD ADD ./target/cucum_techie_demo-1.0-SNAPSHOT.jar cucum_techie_demo-1.0-SNAPSHOT.jar/
ENTRYPOINT ["java","-jar","/cucum_techie_demo-1.0-SNAPSHOT.jar"]