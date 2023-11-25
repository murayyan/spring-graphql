package com.murayyan.graphql.controller;

import com.murayyan.graphql.model.Book;
import com.murayyan.graphql.model.BookInput;
import com.murayyan.graphql.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @QueryMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @MutationMapping
    public Book addBook(@Argument BookInput bookInput) {
        return bookService.saveBook(bookInput);
    }
}
