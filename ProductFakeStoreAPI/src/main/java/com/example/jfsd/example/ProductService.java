package com.example.jfsd.example;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {
	RestTemplate restTemplate;
	public ProductService() {
		this.restTemplate = new RestTemplate();
	}
	  private static final String API_URL = "https://fakestoreapi.com/products";
	  public List<Object> getAllProducts(){
		  ResponseEntity<Object[]> products = restTemplate.getForEntity(API_URL, Object[].class);
		  return Arrays.asList(products);
	  }
}
