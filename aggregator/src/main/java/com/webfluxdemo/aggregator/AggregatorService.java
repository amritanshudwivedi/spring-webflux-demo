package com.webfluxdemo.aggregator;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AggregatorService {

    private final PostService postService;
    private final UserService userService;
    private final RecommendationService recommendationService;

    public AggregatorService(PostService postService, UserService userService,
                             RecommendationService recommendationService) {
        this.postService = postService;
        this.userService = userService;
        this.recommendationService = recommendationService;
    }

    public List<FeedItem> getFeed() {
        List<RecommendationDTO> recommendationDTOS = recommendationService.getRecommendations();
        List<FeedItem> feedItems = new ArrayList<>();
        return recommendationDTOS.stream().map(this::recommendationDTOToFeedItem).collect(Collectors.toList());
    }

    private FeedItem recommendationDTOToFeedItem(RecommendationDTO recommendationDTO) {
        Post post = postService.getPost(recommendationDTO.getPostId());
        User user = userService.getUser(recommendationDTO.getUserId());
        return new FeedItem(user, post);
    }
}
