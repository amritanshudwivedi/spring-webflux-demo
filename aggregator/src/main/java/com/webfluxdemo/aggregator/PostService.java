package com.webfluxdemo.aggregator;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class PostService {

    private final RestTemplate restTemplate;

    public PostService() {
        this.restTemplate = new RestTemplate();
    }

    public Post getPost(UUID postId) {
        return restTemplate.getForEntity("http://localhost:8080/posts/" + postId.toString(), Post.class).getBody();
    }

}
