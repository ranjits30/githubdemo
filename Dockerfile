FROM openjdk:8
EXPOSE 8080
ADD target/stsdemo.jar stsdemo.jar 
ENTRYPOINT ["java","-jar","/stsdemo.jar"]
