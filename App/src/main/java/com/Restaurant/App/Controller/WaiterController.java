package com.Restaurant.App.Controller;

import com.Restaurant.App.Entity.waiter;
import com.Restaurant.App.Repository.WaiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class WaiterController {

    private WaiterRepository waiterRepository;

    @Autowired
    public WaiterController(WaiterRepository waiterRepository) {
        this.waiterRepository = waiterRepository;
    }

    @Autowired


    @GetMapping("/waiters")
    public List<waiter> findAll(){
        return  waiterRepository.findAll();
    }

}
