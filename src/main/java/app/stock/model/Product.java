package app.stock.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int product_id;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int product_id, int price, int qty) {
		this.product_id = product_id;
		this.price = price;
		this.qty = qty;
	}
	private int price;
	private int qty;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	

}
