package com.jsp.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.shoppingcart.entity.ShoppingCart;
import com.jsp.shoppingcart.service.ShoppingService;
import com.jsp.shoppingcart.util.ResponseStructure;

@RestController
public class ShoppingCartController {
	
	@Autowired
	private ShoppingService shopService;
	
	@PostMapping(path = "/add")
	public ResponseEntity<ResponseStructure<ShoppingCart>> addCart(@RequestBody ShoppingCart cart) {
		return shopService.addCart(cart);
	}
	
//	@PostMapping(path="/update")
//	public ShoppingCart updateCart(@RequestBody ShoppingCart cart) {
//		return shopService.updateCart(cart);
//	}
	
	@PostMapping(path="/delete")
	public void deleteCart(@RequestBody ShoppingCart cart) {
		shopService.deleteCart(cart);
	}
	
	@GetMapping(path="/getbyid")
	public ResponseEntity<ResponseStructure<ShoppingCart>> getCartById(@RequestBody ShoppingCart cart) {
		return shopService.getCartById(cart);
	}
	
//	@GetMapping(path="/getbyid")
//	public ResponseEntity<ShoppingCart> getCartById(@RequestBody ShoppingCart cart) {
//		scart=shopService.getCartById(cart);

//		return 	ResponseEntity.status(HttpStatus.OK).body(scart);
//		return new ResponseEntity<>(scart,HttpStatus.CREATED);
//	}
	
//	@GetMapping(path="/getbyid")
//	public ResponseEntity<ResponseStructure<ShoppingCart>> getById(@RequestParam int id){
//		return shopService.getCartById(id);
//	}
	
	
	
	@GetMapping(path="/getall")
	public List<ShoppingCart> getAllCart(){
		return shopService.getAllCart();
	}
	
	
	@PutMapping(path="update/{id}")
	public ResponseEntity<ResponseStructure<ShoppingCart>> updateCart(@PathVariable int id,@RequestBody ShoppingCart cart){
		return shopService.updateCart(id,cart);
	}
}
