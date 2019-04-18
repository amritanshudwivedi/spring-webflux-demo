package com.webfluxdemo.external.users;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    Mono<User> getUser(UUID id) {
        return userRepository.findById(id);
    }

    Mono<User> addUser(User user) {
        return userRepository.save(user);
    }
}
