From openjdk:8

ARG JAR_FILE=target/currency-conversion-services-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} CurrencyconServicedocker01.jar

ENTRYPOINT ["java","-jar","CurrencyconServicedocker01.jar"]