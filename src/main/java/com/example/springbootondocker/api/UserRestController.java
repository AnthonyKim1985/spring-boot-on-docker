package com.example.springbootondocker.api;

import com.example.springbootondocker.domain.User;
import com.example.springbootondocker.persistence.ReactiveUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author Anthony Jinhyuk Kim
 * @version 1.0.0
 * @since 2019-07-19
 */
@RestController
@RequestMapping("/api")
public class UserRestController {
    private final ReactiveUserRepository repository;

    @Autowired
    public UserRestController(ReactiveUserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/hello/{name}")
    public Mono<String> hello(@PathVariable("name") String name) {
        return repository.insert(new User(name))
                .thenReturn(String.format("User %s!", name));
    }
}
