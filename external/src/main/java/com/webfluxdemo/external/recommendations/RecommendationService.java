package com.webfluxdemo.external.recommendations;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class RecommendationService {

    private List<RecommendationDTO> recommendationDTOS = new ArrayList<>();

    RecommendationService() {
        recommendationDTOS.add(
                new RecommendationDTO(
                        UUID.fromString("6677f007-f810-4838-8079-fea349e7dc60"),
                        UUID.fromString("b0fff201-6243-49c6-8678-073c554e9710")));
        recommendationDTOS.add(
                new RecommendationDTO(
                        UUID.fromString("6677f007-f810-4838-8079-fea349e7dc60"),
                        UUID.fromString("b0fff201-6243-49c6-8678-073c554e9710")));
        recommendationDTOS.add(
                new RecommendationDTO(
                        UUID.fromString("6677f007-f810-4838-8079-fea349e7dc60"),
                        UUID.fromString("b0fff201-6243-49c6-8678-073c554e9710")));
        recommendationDTOS.add(
                new RecommendationDTO(
                        UUID.fromString("6677f007-f810-4838-8079-fea349e7dc60"),
                        UUID.fromString("b0fff201-6243-49c6-8678-073c554e9710")));
        recommendationDTOS.add(
                new RecommendationDTO(
                        UUID.fromString("6677f007-f810-4838-8079-fea349e7dc60"),
                        UUID.fromString("b0fff201-6243-49c6-8678-073c554e9710")));
    }

    Flux<RecommendationDTO> getRecommendations() {
        return Flux.fromIterable(recommendationDTOS).delayElements(Duration.ofMillis(200));
    }
}
