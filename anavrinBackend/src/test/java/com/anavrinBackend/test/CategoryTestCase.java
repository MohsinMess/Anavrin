package com.anavrinBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anavrinBackend.dao.CategoryDAO;
import com.anavrinBackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.anavrinBackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
//	@Test
//	public void testAddCategory()
//	{
//		category = new Category();
//		category.setName("Shirts");
//		
//		assertEquals("Category has been added to the table.",true,categoryDAO.add(category));
//	}
	
//	@Test
//	public void testGetCategory()
//	{
//		category = categoryDAO.get(1);
//		assertEquals("Category fetched.","Shirts",category.getName());
//		
//	}
	
//	@Test
//	public void testUpdateCategory()
//	{
//		category = categoryDAO.get(1);
//		category.setName("Jeans");
//		
//		assertEquals("Category Updated.",true,categoryDAO.update(category));
//	}
	
//	@Test
//	public void testDeleteCategory()
//	{
//		category = categoryDAO.get(1);
//		
//		assertEquals("Category Deleted.",true,categoryDAO.delete(category));
//	}
	
//	@Test
//	 public void testListCategory()
//	 {
//		
//		assertEquals("List of Categories fetched.",1,categoryDAO.list().size());
//	
//	}
	
	
	

}
