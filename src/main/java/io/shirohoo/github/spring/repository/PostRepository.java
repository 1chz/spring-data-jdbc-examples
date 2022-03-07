package io.shirohoo.github.spring.repository;

import io.shirohoo.github.spring.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
