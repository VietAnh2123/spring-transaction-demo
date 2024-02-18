package com.anhnhv.springboot.repository;

import com.anhnhv.springboot.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
