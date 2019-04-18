package com.webfluxdemo.external.recommendations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class RecommendationController {

    private final RecommendationService recommendationService;

    public RecommendationController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @GetMapping(value = "/recommendations")
    public Flux<RecommendationDTO> getRecommendations() {
        return recommendationService.getRecommendations();
    }
}
