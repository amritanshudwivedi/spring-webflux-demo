package com.webfluxdemo.aggregator;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.net.URL;
import java.util.UUID;

@Data
class User {
    @NotNull private UUID id;
    @NotNull private String username;
    @NotNull private URL imageURL;
}
