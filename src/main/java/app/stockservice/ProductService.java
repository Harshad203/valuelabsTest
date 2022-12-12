package app.stockservice;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.stock.dao.ProductRepository;
import app.stock.model.Product;

@Transactional
@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Optional<Product> getProductDetailsofProductId(Integer productId) {
		// TODO Auto-generated method stub
		return productRepository.findById(productId);
	}
	
	
	public Product updateProductInfo(Product product){
		return productRepository.saveAndFlush(product);
	}
	

}
