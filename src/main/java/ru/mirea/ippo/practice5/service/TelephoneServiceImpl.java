package ru.mirea.ippo.practice5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mirea.ippo.practice5.model.Telephone;
import ru.mirea.ippo.practice5.repository.TelephoneRepository;

@Service
public class TelephoneServiceImpl extends BaseImpl<Telephone, Long> implements TelephoneService {

    @Autowired
    public TelephoneServiceImpl(TelephoneRepository repository) {
        super(repository);
    }
}
