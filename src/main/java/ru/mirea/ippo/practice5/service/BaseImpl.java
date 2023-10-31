package ru.mirea.ippo.practice5.service;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
public class BaseImpl<T, ID extends Serializable> implements Base<T, ID> {

    protected final JpaRepository<T, ID> repository;


    @Override
    public T save(T item) {
        return repository.save(item);
    }

    @Override
    public T findById(ID id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("No such item in db"));
    }

    @Override
    public T update(T item) {
        return repository.save(item);
    }

    @Override
    public List<T> saveAll(List<T> items) {
        return repository.saveAll(items);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}
