package com.devsup.desafio1.services;

import com.devsup.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    ShippingService shipping;

    public OrderService(ShippingService shipping) {
        this.shipping = shipping;
    }

    public Double total(Order order){
        return order.valorDescontoAplicado() + this.shipping.shipment(order);
    }
}
