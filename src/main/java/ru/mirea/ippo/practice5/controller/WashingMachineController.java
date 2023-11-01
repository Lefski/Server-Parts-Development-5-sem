package ru.mirea.ippo.practice5.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mirea.ippo.practice5.model.WashingMachine;
import ru.mirea.ippo.practice5.service.WashingMachineServiceImpl;

@RestController
@RequestMapping("/washing-machines")
public class WashingMachineController extends BaseController<WashingMachine, Long, WashingMachineServiceImpl> {

    @Autowired
    public WashingMachineController(WashingMachineServiceImpl washingMachine) {
        super(washingMachine);
    }
}
