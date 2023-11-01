package ru.mirea.ippo.practice5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.ippo.practice5.model.WashingMachine;

@Repository
public interface WashingMachineRepository extends JpaRepository<WashingMachine, Long> {
}
