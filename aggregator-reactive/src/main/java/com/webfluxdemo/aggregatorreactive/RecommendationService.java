package com.webfluxdemo.aggregatorreactive;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class RecommendationService {
    private final WebClient webClient;

    public RecommendationService(WebClient.Builder webClient) {
        this.webClient = webClient.baseUrl("http://127.0.0.1:8080/recommendations").build();
    }

    Flux<RecommendationDTO> getRecommendations() {
        return webClient.get().retrieve().bodyToFlux(RecommendationDTO.class);
    }
}
