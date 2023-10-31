package ru.mirea.ippo.practice5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mirea.ippo.practice5.model.Book;
import ru.mirea.ippo.practice5.repository.BooksRepository;

@Service
public class BookServiceImpl extends BaseImpl<Book, Long> implements BookService {

    @Autowired
    public BookServiceImpl(BooksRepository repository) {
        super(repository);
    }
}
