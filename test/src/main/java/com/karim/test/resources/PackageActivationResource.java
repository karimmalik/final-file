package com.karim.test.resources;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.Gson;
import com.karim.test.dto.PackageActivationConfirmationRequest2Dto;
import com.karim.test.dto.PackageActivationConfirmationRequestDto;
import com.karim.test.dto.PackageActivationRequestDto;
import com.karim.test.dto.PackageActivationResponseDto;
import com.karim.test.dto.ResponseDto;
import com.karim.test.dto.ActivationResponse;
import com.karim.test.repositories.PackageActivationRepository;
import com.karim.test.services.PackageActivationService;

@RestController
@RequestMapping("api/package-activation")
public class PackageActivationResource {
	
	@Autowired
	public RedisTemplate template;
		
	@Autowired
	PackageActivationRepository service;
	
	@Autowired
	PackageActivationService activationService;

	@PostMapping
    public ResponseEntity<PackageActivationRequestDto> save(@RequestBody PackageActivationRequestDto product) {
        return service.save(product);
    }

    @GetMapping
    public List<PackageActivationRequestDto> getAllProducts() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public PackageActivationRequestDto findProduct(@PathVariable String id) {
        return service.findProductById(id);
    }
    
    @PostMapping("/confirmation")
    public ResponseEntity<ResponseDto> activationSpecification(@RequestBody PackageActivationConfirmationRequestDto request) {
    	return activationService.confirmation(request);      
    }
    
    @PostMapping("/confirmation2")
    public ResponseEntity<ResponseDto> activationSpecification2(@RequestBody PackageActivationConfirmationRequestDto request) throws JsonMappingException, JsonProcessingException, NoSuchFieldException, SecurityException {
    	return activationService.confirmation2(request);    
    }  
	
}
