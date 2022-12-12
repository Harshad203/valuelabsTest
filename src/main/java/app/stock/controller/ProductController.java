package app.stock.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.stock.model.Product;
import app.stockservice.ProductService;

@CrossOrigin(origins="*")
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/stock-by-product-id/{productId}")
	public Optional<Product> getProductInfo(@PathVariable Integer productId) {		
	    return productService.getProductDetailsofProductId(productId);
	}
	
	
	@PutMapping("/update-product")
	public Product updateProductInfo(@RequestBody Product product) {		
	    return productService.updateProductInfo(product);
	}
	
}
