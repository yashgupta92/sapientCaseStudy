
package com.sapient.casestudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.casestudy.dao.ProductRepository;
import com.sapient.casestudy.model.Product;

@RestController 
public class ProductController {

	@Autowired private ProductRepository repository;
	@GetMapping("/getProductsByBrand/{brand}") 
	public List<Product> getProductByBrand(@PathVariable String brand) { 
		return repository.findByBrand(brand); 
	}
	@GetMapping("/getProductsByColor/{color}") 
	public List<Product> findByColor(@PathVariable String color) { 
		return repository.findByColor(color); 
	}
	@GetMapping("/getProductsBySize/{size}") 
	public List<Product> findBySize(@PathVariable String size) { 
		return repository.findBySize(size); 
	}
	@GetMapping("/getProductBySKU/{sku}") 
	public Product findBySKU(@PathVariable String sku) {
		return repository.findBySKU(sku); 
	}
	@GetMapping("/getProductByPriceRange") 
	public List<Product> findProductByPriceRange(@RequestParam Double from, @RequestParam Double to) { 
		return repository.findProductByPriceRange(from, to); 
	}
	
	@GetMapping("/getcountBySeller/{seller}") 
	public int getcountBySeller(@PathVariable String seller) { 
		return repository.getcountBySeller(seller); 
	}

}
