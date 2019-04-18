package com.webfluxdemo.external.posts;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    Mono<Post> getPost(UUID postId) {
        return postRepository.findById(postId);
    }

    Mono<Post> addPost(Post post) {
        return postRepository.save(post);
    }
}
