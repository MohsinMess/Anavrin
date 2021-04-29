package com.anavrin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.anavrin.Exception.ProductNotFoundException;
import com.anavrinBackend.dao.CategoryDAO;
import com.anavrinBackend.dao.ProductDAO;
import com.anavrinBackend.dto.Category;
import com.anavrinBackend.dto.Product;

@Controller
public class PageController {
	
	@Autowired
	private Product product;
	
	@Autowired
	private Category category;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping({"/","/home"})
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("UserClickHome",true);
		mv.addObject("categories",categoryDAO.list());
		System.out.println("In Home Controller");
		return mv;
	}
	
	@RequestMapping({"/men"})
	public ModelAndView men()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("UserClickMen",true);
		return mv;
	}
	
	@RequestMapping({"/women"})
	public ModelAndView women()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("UserClickWomen", true);
		return mv;
	}
	
	@RequestMapping({"/kids"})
	public ModelAndView kids()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("UserClickKids", true);
		return mv;
	}
	
	@RequestMapping({"/addCategory"})
	public ModelAndView addCategory()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("UserClickAddCategory", true);
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}
	
	@RequestMapping({"/show/category/{id}/products"})
	public ModelAndView showCategoryProducts(@PathVariable("id") int id)
	{
		ModelAndView mv = new ModelAndView("index");
		
		
		category = categoryDAO.get(id);
		mv.addObject("category",category);
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("UserClickCategoryProducts",true);
		return mv;
	}
	
	@RequestMapping({"/show/{id}/product"})
	public ModelAndView showSingleProduct(@PathVariable("id") int id) throws ProductNotFoundException
	{
		ModelAndView mv = new ModelAndView("index");
		product = productDAO.get(id);
		
		//Exception if Product id is tampered in url
		if(product == null) throw new ProductNotFoundException();
		
		//update view count
		product.setViews(1+product.getViews());
		productDAO.update(product);
		
		mv.addObject("product",product);
		mv.addObject("UserClickShowProduct",true);
		
		return mv;
	}
}





