package ru.mirea.ippo.practice5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mirea.ippo.practice5.model.CartItem;

public interface CartItemsRepository extends JpaRepository<CartItem, Long> {
}
