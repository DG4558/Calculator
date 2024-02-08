FROM openjdk:18
WORKDIR ./
COPY ./target/Calci-1.0-SNAPSHOT-jar-with-dependencies.jar ./
CMD ["java","-cp","Calci-1.0-SNAPSHOT-jar-with-dependencies.jar","Calculator"]
