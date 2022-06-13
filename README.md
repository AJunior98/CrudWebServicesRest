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
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('João', '77788899945', 1.182, '1979-04-19',2);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Maria', '66644423545', 2.323, '2007-06-26',3);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Pedro', '4589632145', 3.434, '2003-02-25',0);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Junior', '47151523807', 4.564, '1998-01-31',1);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Alan', '96587412358', 5.663, '1989-09-29',0);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Enzo', '35684213598', 6.789, '1995-10-14',2);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Isabela', '32546987452', 7.867, '1993-12-11',3);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Cavani', '23546897452', 8.910, '2001-11-09',4);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Ronaldo', '23564895423', 4.199, '1991-08-08',3);
INSERT INTO tb_client(name, cpf, income, birth_date, children) VALUES ('Messi', '74589653245', 2.256, '1983-05-01',2);
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
Aqui configuramos em qual ambiente queremos rodar a aplicação (teste, homologação ou produção) e também é feito a atribuição do "false" para que o acesso ao banco seja finalizado na camada de serviço entregando somente a resposta para o controlador Rest.
```
spring.profiles.active=test

spring.jpa.open-in-view=false
```
## application-test.properties
Configuração do banco H2
```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```
## application-dev.properties
Configuração do banco para homologação e produção (Postgresql)
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
Configuração do banco de produção

```
spring.datasource.url=${DATABASE_URL}

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.format_sql=false
```
