package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.ProductDao;
import com.test.entity.Product;
import com.test.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productdao;
	
	
	@Override
	public Product saveProduct(Product obj) {
		
		return productdao.saveProduct(obj);
	}

	@Override
	public Product getProductById(int id) {
		return productdao.getProductById(id);
	}

	@Override
	public Product updateProductById(Product obj) {
		return productdao.updateProductById(obj);
	}

	@Override
	public List<Product> deleteProductById(int id) {
		return productdao.deleteProductById(id);
	
	}

	@Override
	public List<Product> getAllProducts() {
		return productdao.getAllProducts();
	}

	@Override
	public List<Product> getProductsByName(String name) {
		return productdao.getProductsByName(name);
	}

	@Override
	public List<Product> getProductsByQuantity(int qunty) {
		return productdao.getProductsByQuantity(qunty);
	}

	@Override
	public List<Product> getProductsByNameQP(String name) {
		return productdao.getProductsByNameQP(name);
	}

	@Override
	public List<Product> getProductsByQuantityQP(int qnty) {
		return productdao.getProductsByQuantityQP(qnty);
	}

	@Override
	public List<Product> getAllProductsByNameASC() {
	
		return productdao.getAllProductsByNameASC();
	}

}
