package com.Restaurant.App.Controller;

import com.Restaurant.App.Entity.Bill;
import com.Restaurant.App.Repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class BillController {

    private BillRepository billRepository;

    @Autowired
    public BillController(BillRepository theBillRepository){
        billRepository = theBillRepository;
    }

    @GetMapping("/bill")
    public List<Bill> findAll(){
        return billRepository.findAll();
    }

    @GetMapping("/bill/{billId}")
    public Optional<Bill> getBill(@PathVariable int billId){
        return billRepository.findById(billId);
    }

}
