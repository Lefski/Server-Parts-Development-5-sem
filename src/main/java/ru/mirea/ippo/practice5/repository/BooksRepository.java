package ru.mirea.ippo.practice5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mirea.ippo.practice5.model.Book;

public interface BooksRepository extends JpaRepository<Book, Long> {
}
