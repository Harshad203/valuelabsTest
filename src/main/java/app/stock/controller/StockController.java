package app.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import app.stock.model.Stock;
import app.stockservice.StockService;

@CrossOrigin(origins="*")
@RestController
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	
	@GetMapping("/stocks")
	public List<Stock> list() {
		System.out.println("hi this is list functionof stock controller");
	    return stockService.getAll();
	}
	
	
	
	
	public StockController()
	{
		System.out.println("stock controller created");
	}

}
