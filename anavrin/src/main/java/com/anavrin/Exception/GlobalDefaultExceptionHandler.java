package com.anavrin.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice		//Every Controller will take advice of this controller for exceptions
public class GlobalDefaultExceptionHandler {
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handleNoHandlerFoundException()
	{
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errorDescription","The page you are looking for is not available.");
		mv.addObject("errorHead","The page is not Constructed !!");
		
		return mv;
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView handlerProductNotFoundException()
	{
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errorDescription","The Product that you are looking for is not available right now.");
		mv.addObject("errorHead","Product Not Available");
		return mv;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception ex)
	{
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errorDescription",ex.toString());
		mv.addObject("errorHead","Contact you Administrator..!!");
		return mv;
	}

}
