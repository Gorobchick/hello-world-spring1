package com.practice.helloworld.repo;

import com.practice.helloworld.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
