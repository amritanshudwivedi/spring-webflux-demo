package com.webfluxdemo.aggregatorreactive;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class PostService {
    private final WebClient webClient;

    public PostService(WebClient.Builder webClient) {
        this.webClient = webClient.baseUrl("http://localhost:8080/posts/").build();
    }

    Mono<Post> getPost(UUID postId) {
        return webClient.get().uri(postId.toString()).retrieve().bodyToMono(Post.class);
    }
}
