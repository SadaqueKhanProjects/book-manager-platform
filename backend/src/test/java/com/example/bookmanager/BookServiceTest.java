package com.example.bookmanager;

import com.example.bookmanager.entity.Book;
import com.example.bookmanager.exception.NotFoundException;
import com.example.bookmanager.repository.BookRepository;
import com.example.bookmanager.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeEach
    void setUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);  // ✅ pass it to constructor
    }


    @Test
    void testGetAllBooks() {
        Book b1 = new Book();
        b1.setTitle("T1");
        b1.setAuthor("A1");

        when(bookRepository.findAll()).thenReturn(Arrays.asList(b1));

        List<Book> books = bookService.getAllBooks();
        assertEquals(1, books.size());
        assertEquals("T1", books.get(0).getTitle());
    }

    @Test
    void testGetBookById_Found() {
        Book b = new Book();
        b.setId(1L);
        b.setTitle("Java");

        when(bookRepository.findById(1L)).thenReturn(Optional.of(b));

        Book result = bookService.getBookById(1L);
        assertEquals("Java", result.getTitle());
    }

    @Test
    void testGetBookById_NotFound() {
        when(bookRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(NotFoundException.class, () -> bookService.getBookById(99L));
    }
}
