package com.example.mavendemo01.SQL.Redis;

import org.springframework.data.redis.core.index.Indexed;

public class Family {
    @Indexed
    private String type;
    @Indexed
    private String username;
}
