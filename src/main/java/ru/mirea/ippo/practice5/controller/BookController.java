package ru.mirea.ippo.practice5.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mirea.ippo.practice5.model.Book;
import ru.mirea.ippo.practice5.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController extends BaseController<Book, Long, BookService> {

    @Autowired
    public BookController(BookService bookService) {
        super(bookService);
    }
}
