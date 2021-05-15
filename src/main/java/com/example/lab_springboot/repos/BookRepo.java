package com.example.lab_springboot.repos;

import com.example.lab_springboot.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Integer> {
}
