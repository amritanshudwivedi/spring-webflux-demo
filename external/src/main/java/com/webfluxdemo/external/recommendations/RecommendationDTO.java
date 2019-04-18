package com.webfluxdemo.external.recommendations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter @Setter @AllArgsConstructor
class RecommendationDTO {
    private UUID postId;
    private UUID userId;
}
