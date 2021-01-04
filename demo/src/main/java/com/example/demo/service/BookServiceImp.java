package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public class BookServiceImp implements BookService {

    @Autowired
    private BookRepository bookRepository;


    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Optional<Book> get(long id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public void delete(long id) {
        bookRepository.deleteById(id);
    }


}
