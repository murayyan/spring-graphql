package com.murayyan.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Rating {
    FIVE("*****"),
    FOUR("****"),
    THREE("***"),
    TWO("**"),
    ONE("*");

    private final String star;
}
