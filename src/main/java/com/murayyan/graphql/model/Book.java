package com.murayyan.graphql.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private Integer pages;

    @ManyToOne
    @JoinColumn(name="book_id", nullable=false)
    private Author author;
    @Enumerated(EnumType.STRING)
    private Rating rating;

    public Book(String title, Integer pages, Author author, Rating rating) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.rating = rating;
    }
}
