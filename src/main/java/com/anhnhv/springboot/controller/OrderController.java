package com.anhnhv.springboot.controller;

import com.anhnhv.springboot.dto.OrderRequest;
import com.anhnhv.springboot.dto.OrderResponse;
import com.anhnhv.springboot.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
@AllArgsConstructor
public class OrderController {

    private OrderService orderService;

    @PostMapping("/add")
    public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest){

        return ResponseEntity.ok(orderService.placeOrder(orderRequest));
    }

}
