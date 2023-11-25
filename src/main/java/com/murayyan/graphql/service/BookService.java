package com.murayyan.graphql.service;

import com.murayyan.graphql.model.Book;
import com.murayyan.graphql.model.BookInput;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> getAllBooks();
    Book saveBook(BookInput book);
}
