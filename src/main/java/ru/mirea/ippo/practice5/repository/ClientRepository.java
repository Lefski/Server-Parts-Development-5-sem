package ru.mirea.ippo.practice5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.ippo.practice5.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
