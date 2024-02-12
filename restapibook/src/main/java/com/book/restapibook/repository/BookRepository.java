package com.book.restapibook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Component;
import com.book.restapibook.model.Book;

@Repository
@Component
public interface BookRepository extends JpaRepository<Book,Integer>{
    
}
