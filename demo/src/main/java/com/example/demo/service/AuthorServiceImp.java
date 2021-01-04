package com.example.demo.service;

import com.example.demo.model.Author;
import com.example.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AuthorServiceImp implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public void save(Author author) {
        authorRepository.save(author);
    }

    @Override
    public Optional<Author> get(long id) {
        return authorRepository.findById(id);
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @Override
    public void delete(long id) {
        authorRepository.deleteById(id);
    }
}
