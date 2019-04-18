package com.webfluxdemo.external.posts;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostRepository extends ReactiveMongoRepository<Post, UUID> {}
