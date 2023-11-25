package com.murayyan.graphql.service;

import com.murayyan.graphql.model.Author;
import com.murayyan.graphql.model.AuthorInput;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {
    List<Author> getAllAuthors();
    Author saveAuthor(AuthorInput author);
}
