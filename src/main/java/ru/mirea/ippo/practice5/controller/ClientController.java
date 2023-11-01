package ru.mirea.ippo.practice5.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mirea.ippo.practice5.model.Client;
import ru.mirea.ippo.practice5.service.ClientServiceImpl;

@RestController
@RequestMapping("/clients")
public class ClientController extends BaseController<Client, Long, ClientServiceImpl> {

    @Autowired
    public ClientController(ClientServiceImpl clientService) {
        super(clientService);
    }
}
