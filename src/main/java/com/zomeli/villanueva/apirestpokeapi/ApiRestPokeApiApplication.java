package com.zomeli.villanueva.apirestpokeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@EnableCaching
public class ApiRestPokeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiRestPokeApiApplication.class, args);
    }

}
