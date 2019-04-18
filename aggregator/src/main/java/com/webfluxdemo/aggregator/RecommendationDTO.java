package com.webfluxdemo.aggregator;

import lombok.Data;
import java.util.UUID;

@Data
class RecommendationDTO {
    private UUID postId;
    private UUID userId;
}
