package com.example.demo.service;

import com.example.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookService {
    void save(Book book);

    Optional<Book> get(long id);

    List<Book> getAll();

    void delete(long id);

}
