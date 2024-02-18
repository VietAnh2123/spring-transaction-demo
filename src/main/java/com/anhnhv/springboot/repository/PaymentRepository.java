package com.anhnhv.springboot.repository;

import com.anhnhv.springboot.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
