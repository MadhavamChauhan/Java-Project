package com.bookhub.dao;

import com.bookhub.model.Book;
import java.util.List;

public interface BookDAO {
    void addBook(Book book);
    List<Book> listBooks();
    Book getBookById(Long id);
    void updateBook(Book book);
    void deleteBook(Long id);
}
