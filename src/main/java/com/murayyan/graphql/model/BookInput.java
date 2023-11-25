package com.murayyan.graphql.model;

public record BookInput(String title, Integer pages, Integer author, Rating rating) {
}
