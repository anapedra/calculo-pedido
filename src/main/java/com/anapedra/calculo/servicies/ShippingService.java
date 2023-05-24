package com.anapedra.calculo.servicies;

import com.anapedra.calculo.etities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double tabelaFrete(double amount){
        double valorFrete = 0.0;
        if (amount > 0 && amount < 100){
            valorFrete = 20;

        }
        else if (amount >= 100 && amount <= 200){
            valorFrete = 12;
        }
        else {
            valorFrete = 0.0;
        }
        return valorFrete;

    }



}
