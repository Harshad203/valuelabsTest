package app.stockservice;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.stock.dao.StockRepository;
import app.stock.model.Stock;

@Transactional
@Service
public class StockService {
	
	@Autowired
	private StockRepository stockRepository;

	public List<Stock> getAll() {
		// TODO Auto-generated method stub
		return stockRepository.findAll();
	}
	
	
	
	
	
	

}
