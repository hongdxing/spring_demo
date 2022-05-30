package com.hongxing.springcloudstream.function;

import com.hongxing.springcloudstream.dto.OrderDto;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component("newOrderNotify")
public class NewOrderNotify implements Consumer<OrderDto> {

    @Override
    public void accept(OrderDto orderDto) {
        System.out.println("---new order notification sent---");
    }
}
