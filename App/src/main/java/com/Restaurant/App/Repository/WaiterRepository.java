package com.Restaurant.App.Repository;

import com.Restaurant.App.Entity.waiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaiterRepository extends JpaRepository<waiter,Integer> {
}
