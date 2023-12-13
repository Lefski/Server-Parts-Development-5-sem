package ru.mirea.ippo.practice5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mirea.ippo.practice5.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
