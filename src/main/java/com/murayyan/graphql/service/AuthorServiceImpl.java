package com.murayyan.graphql.service;

import com.murayyan.graphql.model.Author;
import com.murayyan.graphql.model.AuthorInput;
import com.murayyan.graphql.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService{

    private final AuthorRepository authorRepository;
    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author saveAuthor(AuthorInput author) {
        Author newAuthor = new Author(author.firstName(), author.lastName());
        return authorRepository.save(newAuthor);

    }
}
