package com.Restaurant.App.Repository;

import com.Restaurant.App.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Integer> {
}
