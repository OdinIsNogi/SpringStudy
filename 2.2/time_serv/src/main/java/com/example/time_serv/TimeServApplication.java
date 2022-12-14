package com.example.time_serv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(value = {"com.example"}) указываем пакет для сканирования элементов
public class TimeServApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeServApplication.class, args);
	}

}
