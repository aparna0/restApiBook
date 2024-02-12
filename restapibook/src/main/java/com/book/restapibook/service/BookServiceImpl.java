package com.book.restapibook.service;

import java.util.List;

import com.book.restapibook.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import com.book.restapibook.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookServiceInterface{
    @Autowired
    BookRepository bookRepo;
    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }
    public Book saveBook(Book book){
        return bookRepo.save(book);
    }
}
