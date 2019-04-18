package com.webfluxdemo.aggregatorreactive;

import lombok.Data;
import java.net.URL;
import java.util.UUID;

@Data
class Post {
    private UUID id;
    private UUID creatorId;
    private String title;
    private URL imageURL;
}
