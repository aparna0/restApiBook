package com.book.restapibook.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.book.restapibook.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import com.book.restapibook.service.BookServiceImpl;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookServiceImpl service;

    @GetMapping("/books")
    public List<Book> getBooks(){
        List<Book> book =service.getAllBooks();
        return book;
    }
    
    @PostMapping("/savebook")
    public Book saveBook(@RequestBody Book book){
        System.out.println(book);
        Book b = service.saveBook(book);
        return b;
    }

}
