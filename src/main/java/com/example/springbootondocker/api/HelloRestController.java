package com.example.springbootondocker.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class HelloRestController {
    @GetMapping("/hello/{name}")
    public Mono<String> hello(@PathVariable("name") String name) {
        return Mono.just(String.format("Hello %s!", name));
    }
}
