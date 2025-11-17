package com.bookhub.dao;

import com.bookhub.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addBook(Book book) {
        currentSession().save(book);
    }

    @Override
    public List<Book> listBooks() {
        return currentSession().createQuery("from Book", Book.class).getResultList();
    }

    @Override
    public Book getBookById(Long id) {
        return currentSession().get(Book.class, id);
    }

    @Override
    public void updateBook(Book book) {
        currentSession().update(book);
    }

    @Override
    public void deleteBook(Long id) {
        Book b = getBookById(id);
        if (b != null) {
            currentSession().delete(b);
        }
    }
}
