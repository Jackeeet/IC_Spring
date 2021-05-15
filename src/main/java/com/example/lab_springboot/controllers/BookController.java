package com.example.lab_springboot.controllers;

import com.example.lab_springboot.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.lab_springboot.services.BookService;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    private List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    private Book get(@PathVariable("id") int id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/book")
    private int save(@RequestBody Book book) {
        bookService.save(book);
        return book.getBookId();
    }

    @PutMapping("/book")
    private Book update(@RequestBody Book book) {
        bookService.save(book);
        return book;
    }

    @DeleteMapping("/books/{id}")
    private void delete(@PathVariable("id") int id) {
        bookService.deleteById(id);
    }
}
