package com.Restaurant.App.Repository;

import com.Restaurant.App.Entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Integer> {

}
