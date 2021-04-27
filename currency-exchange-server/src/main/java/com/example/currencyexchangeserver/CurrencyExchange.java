/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.currencyexchangeserver;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Your Name <rafee at RSAB>
 */
@Entity
public class CurrencyExchange {
    @Id
    private int id;
    @Column(name="currency_from")
    private String from;
    @Column(name="currency_to")
    private String to;
    private BigDecimal exchangeValue;
    private String environment;

    public CurrencyExchange() {
    }

    public CurrencyExchange(int id, String from, String to, BigDecimal exchangeValue, String port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.exchangeValue = exchangeValue;
        this.environment = port;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getExchangeValue() {
        return exchangeValue;
    }

    public void setExchangeValue(BigDecimal exchangeValue) {
        this.exchangeValue = exchangeValue;
    }

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}


    
    
    
}
