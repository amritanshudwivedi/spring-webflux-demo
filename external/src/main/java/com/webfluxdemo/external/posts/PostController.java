package com.webfluxdemo.external.posts;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.util.UUID;

@RestController
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(value = "/posts/{id}")
    public Mono<Post> getPost(@PathVariable UUID id) {
        return postService.getPost(id);
    }

    @PostMapping(value = "/posts")
    public Mono<Post> addPost(@RequestBody @Valid Post post) {
        return postService.addPost(post);
    }
}
