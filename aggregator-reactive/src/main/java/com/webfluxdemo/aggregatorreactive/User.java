package com.webfluxdemo.aggregatorreactive;

import lombok.Data;
import java.net.URL;
import java.util.UUID;

@Data
class User {
    private UUID id;
    private String username;
    private URL imageURL;
}
