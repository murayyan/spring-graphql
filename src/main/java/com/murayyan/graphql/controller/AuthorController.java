package com.murayyan.graphql.controller;

import com.murayyan.graphql.model.Author;
import com.murayyan.graphql.model.AuthorInput;
import com.murayyan.graphql.model.Book;
import com.murayyan.graphql.model.BookInput;
import com.murayyan.graphql.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @QueryMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @MutationMapping
    public Author addAuthor(@Argument AuthorInput authorInput) {
        return authorService.saveAuthor(authorInput);
    }
}
