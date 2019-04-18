package com.webfluxdemo.aggregatorreactive;

import org.springframework.stereotype.Service;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class UserService {
    private final WebClient webClient;

    public UserService(WebClient.Builder webClient) {
        this.webClient = webClient.baseUrl("http://localhost:8080/users/").build();
    }

    Mono<User> getUser(UUID userId) {
        return webClient.get().uri(userId.toString()).retrieve().bodyToMono(User.class);
    }
}