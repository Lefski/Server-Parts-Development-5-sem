package ru.mirea.ippo.practice5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mirea.ippo.practice5.model.Client;
import ru.mirea.ippo.practice5.repository.ClientRepository;

@Service
public class ClientServiceImpl extends BaseImpl<Client, Long> implements ClientService {

    @Autowired
    public ClientServiceImpl(ClientRepository repository) {
        super(repository);
    }
}
