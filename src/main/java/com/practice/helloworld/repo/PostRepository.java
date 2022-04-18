package com.practice.helloworld.repo;

import com.practice.helloworld.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
