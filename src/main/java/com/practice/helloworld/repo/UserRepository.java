package com.practice.helloworld.repo;

import com.practice.helloworld.models.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {
}
