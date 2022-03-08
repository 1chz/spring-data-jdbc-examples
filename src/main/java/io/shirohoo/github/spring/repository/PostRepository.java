package io.shirohoo.github.spring.repository;

import io.shirohoo.github.spring.model.Post;
import org.springframework.data.jdbc.repository.support.SimpleJdbcRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
}
