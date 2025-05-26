package com.example.bookmanager.controller;

import com.example.bookmanager.entity.Book;
import com.example.bookmanager.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getAll() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getBookById(id));
    }

    @PostMapping
    public ResponseEntity<Book> add(@Valid @RequestBody Book book) {
        return ResponseEntity.ok(service.addBook(book));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}
