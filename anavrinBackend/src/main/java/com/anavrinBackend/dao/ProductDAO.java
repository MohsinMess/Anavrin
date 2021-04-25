package com.anavrinBackend.dao;

import java.util.List;

import com.anavrinBackend.dto.Product;

public interface ProductDAO {
	
	List<Product> list();
	Product get(int productId);
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	List<Product> listActiveProducts();
	List<Product> ListActiveProductsByCategory(int categoryId);
	List<Product> getLatestActiveProducts(int count);
}
