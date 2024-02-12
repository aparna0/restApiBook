package com.book.restapibook.service;
import java.util.*;
import com.book.restapibook.model.Book;
import org.springframework.stereotype.Component;

@Component
public interface BookServiceInterface {
    List<Book> getAllBooks();
    
    Book saveBook(Book book); 
}
