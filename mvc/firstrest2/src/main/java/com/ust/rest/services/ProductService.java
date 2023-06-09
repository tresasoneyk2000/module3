package com.ust.rest.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.resource.Product;
import com.ust.rest.respository.ProductRespository;
@Service
public class ProductService {
	@Autowired
	ProductRespository respository;
	public Product getProduct(long productId) {
		return respository.getProduct(productId);
	}
	public ArrayList<Product> getProducts(){
		return respository.getProducts();
		
	}
	public boolean add(Product product) {
		return respository.addProduct(product);
	}
	
	public Product updateProduct(Product product) {
		return respository.updateProduct(product);
	}
	
	public void deleteProduct(long productId) {
		respository.delete(productId);
	}

}
