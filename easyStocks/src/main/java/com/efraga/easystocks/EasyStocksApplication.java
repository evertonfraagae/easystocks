package com.efraga.easystocks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyStocksApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyStocksApplication.class, args);
		System.out.println("Mensagem Teste");
	}

}
