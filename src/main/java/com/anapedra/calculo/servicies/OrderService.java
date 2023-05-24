package com.anapedra.calculo.servicies;

import com.anapedra.calculo.etities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ShippingService shippingService;
    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order){
             return order.getBasicPrice()-(order.getBasicPrice()*order.getDiscout())+shippingService.tabelaFrete(order.getBasicPrice());


    }

}
