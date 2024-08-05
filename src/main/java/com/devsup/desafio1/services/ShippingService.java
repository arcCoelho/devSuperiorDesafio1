package com.devsup.desafio1.services;

import com.devsup.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {


    public Double shipment(Order order) {
        Double frete = 0d;
        if(order.valorDescontoAplicado() < 100){
            frete = 20d;
        }else if (order.valorDescontoAplicado() > 100 && order.valorDescontoAplicado() < 200){
            frete = 12d;
        }
        return frete;
    }
}
