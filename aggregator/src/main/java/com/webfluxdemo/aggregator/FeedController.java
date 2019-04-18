package com.webfluxdemo.aggregator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeedController {
    private final AggregatorService aggregatorService;

    public FeedController(AggregatorService aggregatorService) {
        this.aggregatorService = aggregatorService;
    }

    @GetMapping("/feed")
    public List<FeedItem> getFeed() {
        return aggregatorService.getFeed();
    }
}
