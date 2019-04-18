package com.webfluxdemo.external.posts;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.net.URL;
import java.util.UUID;

@Document @Data
class Post {

    @NotNull private UUID id;
    @NotNull private UUID creatorId;
    @NotNull private String title;
    @NotNull private URL imageURL;
}
