package com.ust.rest.respository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Repository;

import com.ust.rest.resource.Product;

@Repository

public class ProductRespository {

	private ArrayList<Product> productCache=
			new ArrayList<>();
	
	public ProductRespository() {
		Product p1=new Product();
		p1.setProductId(101);
		p1.setName("Laptop");
		p1.setDescription("Macbook Retina Eye");
		p1.setPrice(new BigDecimal(180000));
		p1.setQty(5);
		productCache.add(p1);
		
		
		Product p2=new Product();
		p2.setProductId(102);
		p2.setName("Tablet");
		p2.setDescription("Samsung max view");
		p2.setPrice(new BigDecimal(350000));
		p2.setQty(10);
		productCache.add(p2);
		
		
		
		
		Product p3=new Product();
		p3.setProductId(103);
		p3.setName("Mobile");
		p3.setDescription("Apple iphone");
		p3.setPrice(new BigDecimal(750000));
		p3.setQty(7);
		productCache.add(p3);
		

		Product p4=new Product();
		p4.setProductId(104);
		p4.setName("Television");
		p4.setDescription("Sony Bravo\"");
		p4.setPrice(new BigDecimal(75000));
		p4.setQty(7);
		productCache.add(p4);
		
		
		Product p5=new Product();
		p5.setProductId(105);
		p5.setName("Air Condioner");
		p5.setDescription("Samsung Xcool");
		p5.setPrice(new BigDecimal(44500));
		p5.setQty(15);
		productCache.add(p5);
	}
	
//	r-retrieve
	public Product getProduct(long productId) {
		Iterator<Product> iter=productCache.iterator();
		Product product=null;
		while(iter.hasNext()) {
			product=iter.next();
			if(product.getProductId()==productId) {
				break;
			
		}}
			if(product!=null) {
				return product;
			}
			else {
				return null;
				}
			
			}
	
	// c-create
	public boolean addProduct(Product product) {
		
		if(productCache.add(product)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public ArrayList<Product> getProducts(){
		return productCache;
		
	}
	
//	U-update
	public Product updateProduct(Product productToUpdate) {
		Product searchProduct=null;
		int index=0;
		Iterator<Product> iter=productCache.iterator();
		while(iter.hasNext()) {
			
			searchProduct=iter.next();
			if(searchProduct.getProductId()==productToUpdate.getProductId()) {
				productCache.add(index,productToUpdate);
				productToUpdate=searchProduct;
			}
			index++;
		}
		return productToUpdate;
	}
	
//	D=delete
	
	public void delete(long productId) {
		Iterator<Product> iter= productCache.iterator();
		int index=0;
		while(iter.hasNext()) {
			Product tempProduct=iter.next();
			if(tempProduct.getProductId()==productId) {
				productCache.remove(index);
			}
			index++;
		}
	}
	
	
}
