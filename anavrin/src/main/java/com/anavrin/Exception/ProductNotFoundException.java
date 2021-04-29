package com.anavrin.Exception;

public class ProductNotFoundException extends Exception{
	
	private String message;
	
	public ProductNotFoundException() {
		this("Product is not available !!");
	}
	
	public ProductNotFoundException(String message) {
		this.message = message;
	}
	
	public String getMessage()
	{
		return message;
	}
}
