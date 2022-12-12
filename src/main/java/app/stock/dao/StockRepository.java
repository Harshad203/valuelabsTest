package app.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.stock.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

}
