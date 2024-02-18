package com.anhnhv.springboot.exception;

public class PaymentException extends RuntimeException{

    public PaymentException(String msg){
        super(msg);
    }
}
