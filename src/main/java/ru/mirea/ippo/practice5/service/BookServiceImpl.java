package ru.mirea.ippo.practice5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mirea.ippo.practice5.exception.ValidationException;
import ru.mirea.ippo.practice5.model.Book;
import ru.mirea.ippo.practice5.model.Cart;
import ru.mirea.ippo.practice5.model.CartItem;
import ru.mirea.ippo.practice5.repository.BooksRepository;
import ru.mirea.ippo.practice5.repository.CartItemsRepository;
import ru.mirea.ippo.practice5.repository.CartRepository;

@Service
public class BookServiceImpl extends BaseImpl<Book, Long> implements BookService {

    private final CartRepository cartRepository;
    private final CartItemsRepository cartItemsRepository;

    @Autowired
    public BookServiceImpl(BooksRepository repository, CartRepository cartRepository, CartItemsRepository cartItemsRepository) {
        super(repository);
        this.cartRepository = cartRepository;
        this.cartItemsRepository = cartItemsRepository;
    }

    @Override
    public Cart addToCart(Long itemId, Long userId, Integer cartItemsAmount) {
        if (cartItemsAmount >= 10) {
            throw new ValidationException("Ошибка добавления товара в корзину, столько единиц нет на складе");
        }
        Book book = repository.findById(itemId).orElseThrow();
        Cart cart = cartRepository.findById(userId).orElseThrow();
        CartItem cartItem = CartItem.builder()
                .cart(cart)
                .cartItemId(book.getId())
                .cartItemName(book.getName())
                .cartItemType(book.getProductType())
                .cartItemsAmount(cartItemsAmount)
                .build();
        cartItemsRepository.save(cartItem);
        Cart updatedCart = cartRepository.findById(userId).orElseThrow();
        return updatedCart;
    }
}

