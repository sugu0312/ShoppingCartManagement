package com.jsp.shoppingcart.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.shoppingcart.entity.ShoppingCart;

@Repository
public interface ShoppingCartRepo extends JpaRepository<ShoppingCart, Integer>{

	
	
//	public Optional<ShoppingCart> findById(String sName);
	
	
}
