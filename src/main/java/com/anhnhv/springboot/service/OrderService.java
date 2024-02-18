package com.anhnhv.springboot.service;

import com.anhnhv.springboot.dto.OrderRequest;
import com.anhnhv.springboot.dto.OrderResponse;

public interface OrderService{

    OrderResponse placeOrder(OrderRequest orderRequest);

}
