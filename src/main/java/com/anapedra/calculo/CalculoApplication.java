package com.anapedra.calculo;

import com.anapedra.calculo.etities.Order;
import com.anapedra.calculo.servicies.OrderService;
import com.anapedra.calculo.servicies.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.*;

@SpringBootApplication
public class CalculoApplication implements CommandLineRunner {

     private final OrderService orderService;
     private final ShippingService shippingService;
    public CalculoApplication(OrderService orderService, ShippingService shippingService) {
        this.orderService = orderService;
        this.shippingService = shippingService;
    }

    public static void main(String[] args) {
        SpringApplication.run(CalculoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);

        Order ex1=new Order(1034L,150.00,0.2);
        Order ex2=new Order(2282L,800.00,0.1);
        Order ex3=new Order(1309L,95.90,0.0);

        System.out.println("\nEXEMOPLO 1:");
        System.out.println("Pedido código "+ ex1.getId());
        System.out.println("Valor total: R$ "+orderService.total(ex1));

        System.out.println("\nEXEMOPLO 2:");
        System.out.println("Pedido código "+ ex2.getId());
        System.out.println("Valor total: R$ "+orderService.total(ex2));

        System.out.println("\nEXEMOPLO 3:");
        System.out.println("Pedido código "+ ex3.getId());
        System.out.println("Valor total: R$ "+orderService.total(ex3));










    }
}
