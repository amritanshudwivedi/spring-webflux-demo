package com.webfluxdemo.aggregatorreactive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class AggregatorController {

    private final AggregatorService aggregatorService;

    public AggregatorController(AggregatorService aggregatorService) {
        this.aggregatorService = aggregatorService;
    }

    @GetMapping("/feed")
    public Flux<FeedItem> getFeed() {
        return aggregatorService.getFeed();
    }
}
