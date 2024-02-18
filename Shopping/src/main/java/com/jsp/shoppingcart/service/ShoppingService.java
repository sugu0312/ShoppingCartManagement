package com.jsp.shoppingcart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.shoppingcart.entity.ShoppingCart;
import com.jsp.shoppingcart.exception.ShoppingCartNotFoundException;
import com.jsp.shoppingcart.repository.ShoppingCartRepo;
import com.jsp.shoppingcart.util.ResponseStructure;

@Service
public class ShoppingService {

	@Autowired
	private ShoppingCart shopping;

	@Autowired
	private ShoppingCartRepo shoppingRepo;
	
	@Autowired
	private ResponseStructure<ShoppingCart> structure;

	public ResponseEntity<ResponseStructure<ShoppingCart>> addCart(ShoppingCart cart) {
		ShoppingCart cart2=shoppingRepo.save(cart);
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setData(cart2);
		structure.setMessage("Product Added");
		return new ResponseEntity<ResponseStructure<ShoppingCart>>(structure,HttpStatus.CREATED);
	}
//	public ShoppingCart updateCart(ShoppingCart cart) {
//		shopping=shoppingRepo.findById(cart.getId()).orElse(null);
//		if(shopping != null) {
//			return shoppingRepo.save(cart);
//		}
//		return null;
//	}
	
	public void deleteCart(ShoppingCart cart) {
		shopping=shoppingRepo.findById(cart.getId()).orElse(null);
		if(shopping != null) {
			shoppingRepo.delete(cart);
		}
	}
//	public ShoppingCart getCartById(ShoppingCart cart) {
//		shopping=shoppingRepo.findById(cart.getId()).orElse(null);
//		return shopping;
//	}
	public List<ShoppingCart> getAllCart() {
		return shoppingRepo.findAll();
	}
	public ResponseEntity<ResponseStructure<ShoppingCart>> getCartById(ShoppingCart cart) {
		Optional<ShoppingCart> optional = shoppingRepo.findById(cart.getId());
		if(optional.isPresent()) {
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setMessage("Data Found");
			structure.setData(optional.get());
			
			return new ResponseEntity<ResponseStructure<ShoppingCart>> (structure,HttpStatus.FOUND);
		}
		else {
			throw new ShoppingCartNotFoundException("Product Not Found");
		}
	}
	
	public ResponseEntity<ResponseStructure<ShoppingCart>> findProductById(ShoppingCart cart) {
		Optional<ShoppingCart> option= shoppingRepo.findById(cart.getId());
		if(option.isPresent()) {
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setMessage("Data Found");
			structure.setData(option.get());
			return new ResponseEntity<ResponseStructure<ShoppingCart>>(structure,HttpStatus.FOUND);
		}
		else {
			throw new ShoppingCartNotFoundException("Product not found");
		}
	}

	public ResponseEntity<ResponseStructure<ShoppingCart>> updateCart(int id, ShoppingCart cart) {
		Optional<ShoppingCart> option= shoppingRepo.findById(id);
		
		if(option.isPresent()) {
			ShoppingCart shop=option.get();
			shop=mapToCart(shop,cart);
			shoppingRepo.save(shop);
			
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(shop);
			structure.setMessage("Product updated");
			return new ResponseEntity<ResponseStructure<ShoppingCart>>(structure,HttpStatus.OK);
		}
		return null;
	}
	private ShoppingCart mapToCart(ShoppingCart shop, ShoppingCart cart) {
		shop.setCartItem(cart.getCartItem());
		shop.setBill(cart.getBill());
		return shop;
	}

}
