package com.murayyan.graphql.service;

import com.murayyan.graphql.model.Author;
import com.murayyan.graphql.model.Book;
import com.murayyan.graphql.model.BookInput;
import com.murayyan.graphql.repository.AuthorRepository;
import com.murayyan.graphql.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book saveBook(BookInput book) {
        Author author = authorRepository.findById(book.author()).orElse(null);
        Book newBook = new Book(book.title(), book.pages(), author, book.rating());
        return bookRepository.save(newBook);
    }
}
