package com.ust.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ust.rest.resource.Product;
import com.ust.rest.respository.ProductRepository;

@SpringBootApplication
public class FirstrestApplication implements CommandLineRunner{
	@Autowired
	ProductRepository repo;

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=SpringApplication.run(FirstrestApplication.class, args);
		for(String str: args) {
			System.out.println(str);
		}
		boolean found=ctxt.containsBean("repo");
		System.out.println(found);
		
	}

	@Override public void run(String... args)throws Exception{
		System.out.println("fromCommandLineRunner");
		List<Product> products= repo.findAll();
		System.out.println(products.size());
	}
}
