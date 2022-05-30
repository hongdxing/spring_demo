package com.hongxing.springcloudstream.function;

import com.hongxing.springcloudstream.dto.OrderDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("orderCreated")
@AllArgsConstructor()
public class OrderCreated implements Function<OrderDto, OrderDto> {

    @Override
    public OrderDto apply(OrderDto order) {
        System.out.println(order.getId());
        return order;
    }
}
