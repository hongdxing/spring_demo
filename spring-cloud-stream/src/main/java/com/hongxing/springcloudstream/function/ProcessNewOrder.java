package com.hongxing.springcloudstream.function;

import com.hongxing.springcloudstream.dto.OrderDto;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

@Component("processNewOrder")
public class ProcessNewOrder implements Consumer<OrderDto> {
    @Override
    public void accept(OrderDto orderDto) {
        System.out.println("---process new order begin---");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(orderDto);
    }
}
