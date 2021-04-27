package com.example.currencyexchangeserver;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.Retry;

@RestController
public class CircuitBreakerController {
	@GetMapping("sample-api")
	
	public String sampleAPI() {
		new RestTemplate().getForEntity("http://localhost:8000/some-dummy-url", String.class);
		return "SAMPLE-API";
	}

}
