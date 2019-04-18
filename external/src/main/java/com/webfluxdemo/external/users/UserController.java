package com.webfluxdemo.external.users;


import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public Mono<User> getUser(@PathVariable UUID id) {
        return userService.getUser(id);
    }

    @PostMapping("/users")
    public Mono<User> addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
