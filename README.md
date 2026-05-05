# Konoha

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/Spring%20Boot-4.0.5-brightgreen?style=for-the-badge&logo=springboot" />
  <img src="https://img.shields.io/badge/PostgreSQL-blue?style=for-the-badge&logo=postgresql&logoColor=white" />
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" />
</p>

---

> 🇧🇷 [Leia em Português](#-português) &nbsp;|&nbsp; 🇺🇸 [Read in English](#-english)

---

## 🇧🇷 Português

### 📌 Sobre o projeto

**Konoha** é uma API REST desenvolvida com **Java 17** e **Spring Boot 4**, com persistência de dados via **Spring Data JPA** e banco de dados **PostgreSQL**. Este projeto representa a versão inicial da aplicação, focado na estruturação de uma API backend sólida e organizada.

### 🛠 Tecnologias utilizadas

| Tecnologia | Versão |
|---|---|
| Java | 17 |
| Spring Boot | 4.0.5 |
| Spring Data JPA | - |
| Spring Web MVC | - |
| PostgreSQL | - |
| Lombok | - |
| Maven | - |

### ⚙️ Pré-requisitos

- [Java 17+](https://adoptium.net/)
- [Maven](https://maven.apache.org/) ou usar o wrapper incluso (`./mvnw`)
- [PostgreSQL](https://www.postgresql.org/) instalado e rodando

### 🔧 Configuração

1. Clone o repositório:
```bash
git clone https://github.com/porteiro1/konoha.git
cd konoha
```

2. Configure o banco de dados em `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/konoha
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

3. Execute a aplicação:
```bash
./mvnw spring-boot:run
```

### 📁 Estrutura do projeto

```
konoha/
├── src/
│   ├── main/
│   │   ├── java/verdadade/de/konoha/
│   │   └── resources/
│   └── test/
├── pom.xml
└── README.md
```

### 🔗 Evolução do projeto

Este repositório foi evoluído para **[Konoha V2](https://github.com/porteiro1/konohaV2)**, que inclui documentação interativa com Swagger/OpenAPI.

---

## 🇺🇸 English

### 📌 About

**Konoha** is a REST API built with **Java 17** and **Spring Boot 4**, using **Spring Data JPA** for data persistence and **PostgreSQL** as the database. This project represents the initial version of the application, focused on building a solid and organized backend API structure.

### 🛠 Tech Stack

| Technology | Version |
|---|---|
| Java | 17 |
| Spring Boot | 4.0.5 |
| Spring Data JPA | - |
| Spring Web MVC | - |
| PostgreSQL | - |
| Lombok | - |
| Maven | - |

### ⚙️ Prerequisites

- [Java 17+](https://adoptium.net/)
- [Maven](https://maven.apache.org/) or use the included wrapper (`./mvnw`)
- [PostgreSQL](https://www.postgresql.org/) installed and running

### 🔧 Setup

1. Clone the repository:
```bash
git clone https://github.com/porteiro1/konoha.git
cd konoha
```

2. Configure the database in `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/konoha
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

3. Run the application:
```bash
./mvnw spring-boot:run
```

### 📁 Project Structure

```
konoha/
├── src/
│   ├── main/
│   │   ├── java/verdadade/de/konoha/
│   │   └── resources/
│   └── test/
├── pom.xml
└── README.md
```

### 🔗 Project Evolution

This repository was evolved into **[Konoha V2](https://github.com/porteiro1/konohaV2)**, which includes interactive API documentation with Swagger/OpenAPI.

---

<p align="center">Made with ❤️ by <a href="https://github.com/porteiro1">porteiro1</a></p>
