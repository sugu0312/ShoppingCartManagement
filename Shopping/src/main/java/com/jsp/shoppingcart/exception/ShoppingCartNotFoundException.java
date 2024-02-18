package com.jsp.shoppingcart.exception;

public class ShoppingCartNotFoundException extends RuntimeException{
	
	private String message;
	
	public ShoppingCartNotFoundException(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}
