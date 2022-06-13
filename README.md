# Crud_WebServicesRest

Este é um projeto Spring boot, contendo um CRUD completo de web services REST para acessar um recurso de clientes, neste projeto contém cinco operações basicas:

- Busca paginada de recursos
- Busca de recursos por Id
- Inserção de novo recurso
- Update de recurso
- Delete de recurso

O projeto esta com ambiente de testes configurado acessando o banco de dados H2, usando Maven como gerenciador de dependência, e Java 17 como linguagem.

## Especificações da classe utilizada

O cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da entidade Client é mostrada a seguir:

![image](https://user-images.githubusercontent.com/100853329/173346896-e261750a-65fa-4e98-ab69-71f77495be83.png)

## Dados utilizados no projeto
Seed utilizado no projeto

```
```

## Dependencias Maven utilizadas

```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
	<groupId>com.h2database</groupId>
	<artifactId>h2</artifactId>
	<scope>runtime</scope>
</dependency>

<dependency>
	<groupId>org.postgresql</groupId>
	<artifactId>postgresql</artifactId>
	<scope>runtime</scope>
</dependency>

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-validation</artifactId>
</dependency>

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-test</artifactId>
	<scope>test</scope>
</dependency>

<dependency>
	<groupId>org.hibernate</groupId>
	<artifactId>hibernate-core</artifactId>
	<version>6.1.0.Final</version>
	<type>pom</type>
</dependency>
```
## Arquivos de configuração utilizados
## application.properties

```
spring.profiles.active=test

spring.jpa.open-in-view=false
```
## application-test.properties
```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```
## application-dev.properties
```
spring.jpa.properties.javax.persistence.schema-generation.create-source=metadata
spring.jpa.properties.javax.persistence.schema-generation.scripts.action=create
spring.jpa.properties.javax.persistence.schema-generation.scripts.create-target=create.sql
spring.jpa.properties.hibernate.hbm2ddl.delimiter=;

spring.datasource.url=jdbc:postgresql://localhost:5432/dspesquisa
spring.datasource.username=postgres
spring.datasource.password=1234567

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.jpa.hibernate.ddl-auto=none
```
## application-prod.properties
```
spring.datasource.url=${DATABASE_URL}

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.format_sql=false
```
