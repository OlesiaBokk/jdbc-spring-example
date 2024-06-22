package ru.itgirl.jdbc_spring_example.repository;

import ru.itgirl.jdbc_spring_example.entity.Book;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface BookRepository {
    List<Book> findAllBooks();
    Optional<Book> getBookById(Long id) throws SQLException;
}
