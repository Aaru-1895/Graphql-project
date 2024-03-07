package com.graphql.Graphqlproject.controller;

import com.graphql.Graphqlproject.entity.Book;
import com.graphql.Graphqlproject.service.BookService;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @QueryMapping("allBooks")
    public List<Book> getAll() {
        return this.bookService.getAllBook();
    }

    @QueryMapping("getBook")
    public Book get(@Argument int bookId) {
        return this.bookService.getBook(bookId);
    }

    @MutationMapping("createBook")
    public Book create(@Argument BookInput book) {
        Book b=new Book();
        b.setTitle(book.getTitle());
        b.setDesc(book.getDesc());
        b.setPrice(book.getPrice());
        b.setAuthor(book.getAuthor());
        b.setPages(book.getPages());
        return this.bookService.createBook(b);
    }

}
@Getter
@Setter
class BookInput{
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
}
