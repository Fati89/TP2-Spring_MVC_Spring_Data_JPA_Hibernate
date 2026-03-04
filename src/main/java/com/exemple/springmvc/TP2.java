package com.exemple.springmvc;

import com.exemple.springmvc.entities.Product;
import com.exemple.springmvc.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.security.Security;

// @SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@SpringBootApplication
public class TP2 {

    public static void main(String[] args) {
        SpringApplication.run(TP2.class, args);
    }

    @Bean // “Spring, crée-moi cet objet et garde-le en mémoire pour que je puisse l’injecter partout où j’en ai besoin.”
    public CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                    .name("Printer")
                    .price(5400)
                    .quantity(10)
                    .build());
            productRepository.save(Product.builder()
                    .name("Smart Phone")
                    .price(120000)
                    .quantity(50)
                    .build());
            productRepository.findAll().forEach(p->{
                System.out.println(p.toString());
            });
        };
    }

}