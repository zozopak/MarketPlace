package com.example.demo.service;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AuthorService {
    void save(Author author);

    Optional<Author> get(long id);

    List<Author> getAll();

    void delete(long id);
}
