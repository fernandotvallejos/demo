package com.example.demo;

import com.example.demo.service.OperationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.expression.Operation;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hola world");

		OperationService a = new OperationService() {
			@Override
			public int sumar(int sumando1, int sumando2) {
				int suma = sumando1+sumando2;
				return suma;
			}
		};


		System.out.println(a.sumar(1,3));
		OperationService a2 = (sumando1,sumando2)->sumando1+sumando2;
		System.out.println(a2.sumar(1,2));

		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(4);
		lista.add(5);
		lista.add(2);

		lista.stream().forEach(valior-> System.out.println(valior));



	}

}
