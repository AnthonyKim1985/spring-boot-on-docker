package com.example.springbootondocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

/**
 * @author Anthony Jinhyuk Kim
 * @version 1.0.0
 * @since 2019-07-19
 */
@EnableWebFlux
@EnableMongoAuditing
@EnableReactiveMongoRepositories
@SpringBootApplication
public class SpringBootOnDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOnDockerApplication.class, args);
    }

}
