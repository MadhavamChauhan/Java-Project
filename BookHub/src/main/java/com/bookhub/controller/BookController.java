package com.bookhub.controller;

import com.bookhub.dao.BookDAO;
import com.bookhub.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookDAO bookDAO;

    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookDAO.listBooks());
        return "viewBooks";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("book", new Book());
        return "addBook";
    }

    @PostMapping("/add")
    public String addBook(@ModelAttribute("book") Book book) {
        bookDAO.addBook(book);
        return "redirect:/books";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id) {
        bookDAO.deleteBook(id);
        return "redirect:/books";
    }
}
