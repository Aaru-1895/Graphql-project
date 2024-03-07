package com.graphql.Graphqlproject.service.impl;

import com.graphql.Graphqlproject.entity.Book;
import com.graphql.Graphqlproject.repository.BookRepo;
import com.graphql.Graphqlproject.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookRepo bookRepo;

    @Autowired
    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book createBook(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book getBook(int bookId) {
        return this.bookRepo.findById(bookId).orElseThrow(() -> new RuntimeException("Book you are looking for not found on server !!"));
    }

}
