package com.webfluxdemo.aggregator;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.net.URL;
import java.util.UUID;

@Data
class Post {

    @NotNull private UUID id;
    @NotNull private UUID creatorId;
    @NotNull private String title;
    @NotNull private URL imageURL;
}
