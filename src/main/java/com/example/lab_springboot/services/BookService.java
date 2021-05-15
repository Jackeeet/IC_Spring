package com.example.lab_springboot.services;

import com.example.lab_springboot.models.Book;
import com.example.lab_springboot.repos.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    public List<Book> getAllBooks() {
        return (List<Book>) bookRepo.findAll();
    }

    public Book getBookById(int id) {
        return bookRepo.findById(id).get();
    }

    public void deleteById(int id) {
        bookRepo.deleteById(id);
    }

    public void save(Book book) {
        bookRepo.save(book);
    }
}
