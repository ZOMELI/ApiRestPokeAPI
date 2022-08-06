# Api BS ApiRestPokeAPI

[![npm version](https://img.shields.io/github/workflow/status/dlfigueira/spring-pokeapi/CI?style=plastic)](https://img.shields.io/github/workflow/status/dlfigueira/spring-pokeapi/CI?style=plastic)
[![npm version](https://img.shields.io/badge/realese-1.0.0-green?style=plastic&logo=git)](https://img.shields.io/badge/realese-1.0.0-green?style=plastic&logo=git)
[![codecov](https://codecov.io/gh/Thibstars/Currency-Converter-Bot/branch/master/graph/badge.svg)](https://codecov.io/gh/Thibstars/Currency-Converter-Bot)

This is a sample representation of the UNICA Customer Information API that
The applications use it to manage the information of the pokemon's.
Pokemón queries detail their basic information such as Type, Weight, and Ability List.
The Api also exposes the pokemon's queries by Description and Evolutions.

#
Spring Boot library wrapper for [PokéAPI](https://pokeapi.co/).

## Features
* None

## Install
Add dependency to Github Package registry

#### Github Package Registry
The library is available in Github Package Registry:

1. Dependency repository pom.xml

    <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>2.7.2</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
            <scope>runtime</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-hateoas</artifactId>
        </dependency>

        <dependency>
            <groupId>org.apache.httpcomponents</groupId>
            <artifactId>httpclient</artifactId>
        </dependency>
        
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>

            <dependency>
                <groupId>org.junit.jupiter</groupId>
                <artifactId>junit-jupiter</artifactId>
                <scope>test</scope>
            </dependency>

        <dependency>
            <groupId>org.assertj</groupId>
            <artifactId>assertj-core</artifactId>
            <version>3.14.0</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.squareup.retrofit2/converter-gson -->
        <dependency>
            <groupId>com.squareup.retrofit2</groupId>
            <artifactId>converter-gson</artifactId>
            <version>2.1.0</version>
        </dependency>


        <!-- https://mvnrepository.com/artifact/com.squareup.retrofit2/adapter-rxjava2 -->
        <dependency>
            <groupId>com.squareup.retrofit2</groupId>
            <artifactId>adapter-rxjava2</artifactId>
            <version>2.2.0</version>
        </dependency>


        <!-- https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxjava -->
        <dependency>
            <groupId>io.reactivex.rxjava2</groupId>
            <artifactId>rxjava</artifactId>
            <version>2.2.21</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.squareup.retrofit2/retrofit -->
        <dependency>
            <groupId>com.squareup.retrofit2</groupId>
            <artifactId>retrofit</artifactId>
            <version>2.9.0</version>
        </dependency>
        
        <!-- Spring caching enabled -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-cache</artifactId>
        </dependency>
        <dependency>
            <groupId>org.ehcache</groupId>
            <artifactId>ehcache</artifactId>
            <version>3.8.1</version>
        </dependency>
        <dependency>
            <groupId>net.sf.ehcache</groupId>
            <artifactId>ehcache-core</artifactId>
            <version>2.6.11</version>
        </dependency>

        <!--SpringFox dependencies -->
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>3.0.0</version>
        </dependency>
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>3.0.0</version>
        </dependency>
        <dependency>
            <groupId>javax.xml.bind</groupId>
            <artifactId>jaxb-api</artifactId>
            <version>2.3.1</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.datatype</groupId>
            <artifactId>jackson-datatype-jsr310</artifactId>
        </dependency>
        <dependency>
            <groupId>org.openapitools</groupId>
            <artifactId>jackson-databind-nullable</artifactId>
            <version>0.2.1</version>
        </dependency>
        <!-- Bean Validation API support -->
        <dependency>
            <groupId>javax.validation</groupId>
            <artifactId>validation-api</artifactId>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
        </dependency>


#### Maven
Usage maven version 3.6.3

## Usage

#### Configuration

#### Resources
This library exposes all resources as Spring components, which can be autowired into your code.
Each component points to a separate resource in ApiRestPokeAPI.

* PokeApiResponse
* PokeApiAbility
* PokeApiPokemon
* PokeApiType
* ExceptionType
* ExceptionDetailType

Each of these resources exposes a method to get all resources (paginated with a limit and offset) and methods to get resource by id or name, where available.

## License
This project is not licensed.

## Ejecución
El proyecto ejecutar con IntellijIdea o usar maven para construir el proyecto y generar el jar.

Dentro de la carpeta del proyecto
 ```
 cd ApiRestPokeAPI
 ```

Para construir el proyecto ejecutar
```
mvn package
 ```

Ejecutar aplicación
```
java -jar target/ApiRestPokeAPI-demo-0.0.1-SNAPSHOT.jar
```

Para ejecutar una prueba
```
curl --header "content-type: text/xml" -d @request.xml http://localhost:9004/ws > output.xml
```
