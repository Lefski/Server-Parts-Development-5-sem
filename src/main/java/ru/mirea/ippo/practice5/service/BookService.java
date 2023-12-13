package ru.mirea.ippo.practice5.service;

import ru.mirea.ippo.practice5.model.Book;
import ru.mirea.ippo.practice5.model.Cart;

public interface BookService extends Base<Book, Long> {


    Cart addToCart(Long itemId, Long userId, Integer cartItemsAmount);
}
