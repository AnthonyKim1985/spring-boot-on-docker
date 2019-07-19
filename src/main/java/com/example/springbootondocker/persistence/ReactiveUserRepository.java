package com.example.springbootondocker.persistence;

import com.example.springbootondocker.domain.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Anthony Jinhyuk Kim
 * @version 1.0.0
 * @since 2019-07-19
 */
@Repository
public interface ReactiveUserRepository extends ReactiveMongoRepository<User, ObjectId> {
}
