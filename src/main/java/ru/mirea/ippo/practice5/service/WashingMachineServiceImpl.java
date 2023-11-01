package ru.mirea.ippo.practice5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ru.mirea.ippo.practice5.model.WashingMachine;
import ru.mirea.ippo.practice5.repository.WashingMachineRepository;

@Service
public class WashingMachineServiceImpl extends BaseImpl<WashingMachine, Long> implements WashingMachineService {

    @Autowired
    public WashingMachineServiceImpl(WashingMachineRepository repository) {
        super(repository);
    }
}
