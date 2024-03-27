# Java AI Powered Bootcamp 2024

RESTful API built in Java 17 with Spring Boot 3 developed in the final challenge of the [Java AI Powered Bootcamp](https://www.dio.me/bootcamp/coding-future-tonnie-java-ai-powered).

## Technologies
- Java 17
- Spring Boot 3
- Spring Data JPA
- OpenAPI (Swagger)

## Class Diagram (API Domain)

```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```
