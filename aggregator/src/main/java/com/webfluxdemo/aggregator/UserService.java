package com.webfluxdemo.aggregator;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class UserService {

    private final RestTemplate restTemplate;

    UserService() {
        this.restTemplate = new RestTemplate();
    }

    User getUser(UUID userId) {
        return restTemplate.getForEntity("http://localhost:8080/users/" + userId.toString(), User.class).getBody();
    }
}
