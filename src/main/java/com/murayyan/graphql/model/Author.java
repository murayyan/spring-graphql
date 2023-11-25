package com.murayyan.graphql.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="author")
public class  Author {
    @Id
    @GeneratedValue
    Integer id;
    String firstName;
    String lastName;

    @OneToMany(mappedBy = "author")
    private List<Book> book;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
