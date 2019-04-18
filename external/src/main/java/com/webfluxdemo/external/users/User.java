package com.webfluxdemo.external.users;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.net.URL;
import java.util.UUID;

@Document @Data
class User {
    @Id
    @NotNull private UUID id;
    @NotNull private String username;
    @NotNull private URL imageURL;

}
