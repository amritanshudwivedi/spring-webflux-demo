package com.webfluxdemo.aggregator;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RecommendationService {

    private final RestTemplate restTemplate;

    RecommendationService() {
        this.restTemplate = new RestTemplate();
    }

    List<RecommendationDTO> getRecommendations() {
        ResponseEntity<List<RecommendationDTO>> listResponseEntity = restTemplate.exchange(
                "http://localhost:8080/recommendations",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<RecommendationDTO>>(){});
        return listResponseEntity.getBody();
    }
}
