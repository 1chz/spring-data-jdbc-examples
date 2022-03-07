package io.shirohoo.github.spring.service;

import io.shirohoo.github.spring.model.Post;
import io.shirohoo.github.spring.repository.PostRepository;
import java.util.List;
import java.util.stream.StreamSupport;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, timeout = 3)
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public Post saveOrUpdate(Post post) {
        return postRepository.save(post);
    }

    public Post findById(Long id) {
        return postRepository.findById(id)
            .orElseThrow();
    }

    public List<Post> findAll() {
        Iterable<Post> iterable = postRepository.findAll();
        return StreamSupport
            .stream(iterable.spliterator(), false)
            .toList();
    }

    @Transactional
    public void deleteById(Long id) {
        postRepository.deleteById(id);
    }
}
