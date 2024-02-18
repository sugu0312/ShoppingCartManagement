package com.jsp.shoppingcart.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.shoppingcart.exception.ShoppingCartNotFoundException;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	@Autowired
	private ErrorStructure<String> structure;
	
	@ExceptionHandler(ShoppingCartNotFoundException.class)
	public ResponseEntity<ErrorStructure<String>> handleShoppingCartNotFoundException(ShoppingCartNotFoundException ex){
		
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setMessage(ex.getMessage());
		structure.setRootCause("The requested user with the givesn id is not found");
		
		return new ResponseEntity<ErrorStructure<String>>(structure,HttpStatus.NOT_FOUND);
		
	}
}
