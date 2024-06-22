package ru.itgirl.jdbc_spring_example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.jdbc_spring_example.repository.BookRepository;
import ru.itgirl.jdbc_spring_example.entity.Book;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book/all")
    public List<Book> getAllBooks() {
        return bookRepository.findAllBooks();
    }

    @GetMapping("/book/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) throws SQLException {
        return bookRepository.getBookById(id);
    }
}
