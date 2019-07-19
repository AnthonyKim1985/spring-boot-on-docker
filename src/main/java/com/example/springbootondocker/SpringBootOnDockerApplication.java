package com.example.springbootondocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class SpringBootOnDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOnDockerApplication.class, args);
    }

}
