package com.ebazaronline.ebazar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EbazarApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbazarApplication.class, args);
		System.out.println("Ebazar is online now...");
    }

}