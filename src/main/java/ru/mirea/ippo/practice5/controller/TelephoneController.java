package ru.mirea.ippo.practice5.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mirea.ippo.practice5.model.Telephone;
import ru.mirea.ippo.practice5.service.TelephoneServiceImpl;

@RestController
@RequestMapping("/telephones")
public class TelephoneController extends BaseController<Telephone, Long, TelephoneServiceImpl> {

    @Autowired
    public TelephoneController(TelephoneServiceImpl telephoneService) {
        super(telephoneService);
    }
}
