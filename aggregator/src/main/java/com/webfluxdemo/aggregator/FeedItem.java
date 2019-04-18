package com.webfluxdemo.aggregator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
class FeedItem {
    private User user;
    private Post post;
}
