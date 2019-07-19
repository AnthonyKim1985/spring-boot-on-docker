package com.example.springbootondocker.domain;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

/**
 * @author Anthony Jinhyuk Kim
 * @version 1.0.0
 * @since 2019-07-19
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Document(collection = "users")
public class User {
    @Id
    private ObjectId id;

    @NotBlank
    private String name;

    public User(@NotBlank String name) {
        this.name = name;
    }
}
