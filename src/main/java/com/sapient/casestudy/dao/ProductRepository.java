
  package com.sapient.casestudy.dao;
  
  import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sapient.casestudy.model.Product;
  
  
  public interface ProductRepository extends JpaRepository<Product, Integer>
  {
	  @Query("SELECT p FROM Product p  WHERE brand.name=(:brand)")
	  List<Product> findByBrand(@Param("brand") String brand);
	  
	  @Query("SELECT p FROM Product p  WHERE p.color=(:color)")
	  List<Product> findByColor(@Param("color") String color);
  
	  @Query("SELECT p FROM Product p  WHERE p.size=(:size)")
	  List<Product> findBySize(@Param("size") String size);
  
	  @Query("SELECT p FROM Product p  WHERE p.sku=(:sku)")
	  Product findBySKU(@Param("sku") String sku);
	  
	  @Query("SELECT p FROM Product p  WHERE p.prize>=(:from) and p.prize<=(:to)")
	  List<Product> findProductByPriceRange(Double from, Double to);
	  
	  @Query("SELECT count(*) FROM Product p  WHERE seller.name=(:seller)")
	  int getcountBySeller(String seller);
	  
  
  }
 