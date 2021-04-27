package com.example.currencyexchangeserver;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<CurrencyExchange, Long>{
	
	CurrencyExchange findByFromAndTo(String from, String to);

}
