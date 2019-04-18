package com.webfluxdemo.aggregatorreactive;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AggregatorService {
    private final RecommendationService recommendationService;
    private final PostService postService;
    private final UserService userService;

    public AggregatorService(RecommendationService recommendationService,
                             PostService postService, UserService userService) {
        this.recommendationService = recommendationService;
        this.postService = postService;
        this.userService = userService;
    }

    Flux<FeedItem> getFeed() {
        Flux<RecommendationDTO> recommendationDTOFlux = recommendationService.getRecommendations();
        return recommendationDTOFlux.flatMap(this::recommendationDTOToFeedItem);
    }

    private Mono<FeedItem> recommendationDTOToFeedItem(RecommendationDTO recommendationDTO) {
        Mono<Post> postMono = postService.getPost(recommendationDTO.getPostId());
        Mono<User> userMono = userService.getUser(recommendationDTO.getUserId());
        return Mono.zip(userMono, postMono).map(t -> new FeedItem(t.getT1(), t.getT2()));
    }
}
