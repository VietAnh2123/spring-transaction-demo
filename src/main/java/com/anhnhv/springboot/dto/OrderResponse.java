package com.anhnhv.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderResponse {

    private String orderTrackingNumber;
    private String status;
    private String message;

}
