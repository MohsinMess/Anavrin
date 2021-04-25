package com.anavrinBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anavrinBackend.dao.ProductDAO;
import com.anavrinBackend.dto.Product;

public class ProductTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private Product product;
	
	private static ProductDAO productDAO;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.anavrinBackend");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("productDAO");
	}
	
	@Test
	public void testCases()
	{
		
//		product = new Product();
//		product.setName("Black");
//		product.setBrand("Raymond");
//		product.setDescription("Indian Quality");
//		product.setPrice(2000);
//		product.setQuantity(2);
//		product.setActive(true);
//		product.setCategoryId(1);
//		product.setSupplierId(2);
//		
//		assertEquals("Product not Added.",true,productDAO.add(product));
		
//		product = new Product();
//		product.setName("Red");
//		product.setBrand("Wrangler");
//		product.setDescription("US Quality");
//		product.setPrice(3000);
//		product.setQuantity(4);
//		product.setActive(true);
//		product.setCategoryId(1);
//		product.setSupplierId(2);
//		
//		assertEquals("Product not Added.",true,productDAO.add(product));
//		
//		product = new Product();
//		product.setName("Blue");
//		product.setBrand("HRX");
//		product.setDescription("Indian Quality");
//		product.setPrice(3000);
//		product.setQuantity(5);
//		product.setActive(true);
//		product.setCategoryId(1);
//		product.setSupplierId(2);
//		
//		assertEquals("Product not Added.",true,productDAO.add(product));
//		
//		product = new Product();
//		product.setName("White");
//		product.setBrand("Max");
//		product.setDescription("Gulf Quality");
//		product.setPrice(2500);
//		product.setQuantity(10);
//		product.setActive(true);
//		product.setCategoryId(1);
//		product.setSupplierId(2);
//		
//		assertEquals("Product not Added.",true,productDAO.add(product));
		
//		product = productDAO.get(2);
//		product.setPrice(3000);
//		assertEquals("Product not Updated",true,productDAO.update(product));
//		
//		product = productDAO.get(1);
//		assertEquals("Product Deactivated",true,productDAO.delete(product));
//		
//		assertEquals("List of Products not fetched.",4,productDAO.list().size());
//		
//		assertEquals("List of Active Products not fetched.",3,productDAO.listActiveProducts().size());
//		
//		assertEquals("List of Active Products by Category not fetched.",3,productDAO.ListActiveProductsByCategory(1).size());
//		
//		assertEquals("Latest Product not fetched.",2,productDAO.getLatestActiveProducts(2).size());
		
		
	}
	

}
