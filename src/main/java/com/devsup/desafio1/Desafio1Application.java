package com.devsup.desafio1;

import com.devsup.desafio1.entities.Order;
import com.devsup.desafio1.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	OrderService orderService;

	public Desafio1Application(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order comrpa1 = new Order("1034", 150.00, 20.0);
		Order comrpa2 = new Order("2282", 800.00, 10.0);
		Order comrpa3 = new Order("1309", 95.90, 0.0);

		System.out.println("compra 1: "+comrpa1+" - valor total da compra com frete: "+orderService.total(comrpa1));
		System.out.println("compra 2: "+comrpa2+" - valor total da compra com frete: "+orderService.total(comrpa2));
		System.out.println("compra 3: "+comrpa3+" - valor total da compra com frete: "+orderService.total(comrpa3));
	}
}
