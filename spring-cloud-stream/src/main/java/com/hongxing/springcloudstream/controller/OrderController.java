package com.hongxing.springcloudstream.controller;

import com.hongxing.springcloudstream.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    StreamBridge streamBridge;

    @PostMapping()
    public String createOrder(){
        var order = new OrderDto();
        order.setId(UUID.randomUUID().toString());
        order.setAmount(5d);
        streamBridge.send("d-order-created", order);
        System.out.println("---request finished---");
        return order.getId();
    }
}
