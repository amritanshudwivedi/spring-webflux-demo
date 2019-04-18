package com.webfluxdemo.aggregatorreactive;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
class FeedItem {
    private User user;
    private Post post;
}
