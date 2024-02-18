package com.anhnhv.springboot.service;

import com.anhnhv.springboot.dto.OrderRequest;
import com.anhnhv.springboot.dto.OrderResponse;
import com.anhnhv.springboot.exception.PaymentException;
import com.anhnhv.springboot.model.Order;
import com.anhnhv.springboot.model.Payment;
import com.anhnhv.springboot.repository.OrderRepository;
import com.anhnhv.springboot.repository.PaymentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService{

    private OrderRepository orderRepository;
    private PaymentRepository paymentRepository;

    @Override
    @Transactional
    public OrderResponse placeOrder(OrderRequest orderRequest) {

        Order order = orderRequest.getOrder();
        order.setStatus("In Progress");
        order.setOrderTrackingNumber(UUID.randomUUID().toString());
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();

        if(!payment.getType().equals("DEBIT") && !payment.getType().equals("CREDIT")){
            throw new PaymentException("Payment card type do not support!");
        }

        payment.setOrderId(order.getId());
        paymentRepository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTrackingNumber(order.getOrderTrackingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("Success");

        return orderResponse;
    }
}
