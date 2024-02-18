package com.anhnhv.springboot.dto;

import com.anhnhv.springboot.model.Order;
import com.anhnhv.springboot.model.Payment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderRequest {

    private Order order;
    private Payment payment;

}
