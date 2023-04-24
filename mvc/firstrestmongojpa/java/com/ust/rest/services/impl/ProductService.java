package com.ust.rest.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.resource.Product;
import com.ust.rest.respository.ProductRepository;
import com.ust.rest.services.interfaces.ProductServiceIface;


//import com.ust.rest.respository.ProductRespository;
@Service
public class ProductService implements ProductServiceIface{
	@Autowired
	ProductRepository respository;
//	public Product getProduct(long productId) {
//		return respository.getProduct(productId);
//	}
//	public ArrayList<Product> getProducts(){
//		return respository.getProducts();
//		
//	}
	public Product add(Product product) {
		 return respository.save(product);}
		
	
	
	public Product getProduct(String _id) {
		Optional<Product> optional=
				respository.findById(_id);
				if(optional.isPresent()) {
					return optional.get();
				}
				else {
					return null;
				}
	}
	
	
	public List<Product> getProducts(){
		return respository.findAll();	}
	
	
	public Product updateProduct(Product product) {
		return respository.save(product);
	}
//	
	public void deleteProduct(String productId) {
		respository.deleteById(productId);
	}


//	@Override
//	public Product add(Product product) {
//		// TODO Auto-generated method stub
//		return null;
//	}


	
//	public Product getProduct(String productId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//
//	@Override
//	public void deleteProduct(String productId) {
//		// TODO Auto-generated method stub
//		
//	}

}
