package com.zelalem.electronics_products.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zelalem.electronics_products.domain.Product;
import com.zelalem.electronics_products.domain.ProductRepository;

	@Service
		// ProductService Interface
		public interface ProductService {

		    List<Product> getAllProducts();

		    Product getProductById(Long id);

		    Product createProduct(Product product);

		    Product updateProduct(Long id, Product productDetails);

			List<Product> getProductsByCategory(Long categoryId);

			List<Product> searchProductsByName(String name);

			boolean deleteProduct(Long id);

			

			
			
		}

	
	

