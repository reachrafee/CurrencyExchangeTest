/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.currencyexchangeserver;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Your Name <rafee at RSAB>
 */
@RestController
public class CurrencyExchangeController {
	@Autowired
	CurrencyRepository repo;
    @Autowired
    Environment environment;
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchange(@PathVariable String from, @PathVariable String to){
        String port = environment.getProperty("local.server.port");
        
       // CurrencyExchange currencyExchange = new CurrencyExchange(1, "USD", "INR", BigDecimal.valueOf(64.09), port + " instance-id ");
        CurrencyExchange currencyExchange = repo.findByFromAndTo(from, to);
        currencyExchange.setEnvironment(port);
        if(null == currencyExchange)
        	throw new RuntimeException("Unable to find from "+ from + " to "+to);
		return currencyExchange;
    }
    
}
