package com.karim.test.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.AbstractClientHttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.karim.test.Constants;
import com.karim.test.domain.Offer;
import com.karim.test.dto.ProductDto;
import com.karim.test.services.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductResource {

	@Autowired
	ProductService service;

	@GetMapping("/")
	public List<ProductDto> getAllProducts() {
		return service.retrieveProduct();
	}
	
}
