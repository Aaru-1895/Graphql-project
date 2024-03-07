package com.graphql.Graphqlproject.service;

import com.graphql.Graphqlproject.entity.Book;
import java.util.List;
import org.springframework.stereotype.Service;


public interface BookService {

    public Book getBook(int bookid);

    public List<Book> getAllBook();

    public Book createBook(Book book);


}
