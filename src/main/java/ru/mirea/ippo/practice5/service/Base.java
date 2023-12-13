package ru.mirea.ippo.practice5.service;

import ru.mirea.ippo.practice5.model.Cart;

import java.io.Serializable;
import java.util.List;

public interface Base<T, ID extends Serializable> {
    T save(T item);

    T findById(ID id);

    T update(T item);

    List<T> saveAll(List<T> items);

    List<T> findAll();

    void deleteById(ID id);

}
