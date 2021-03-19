package com.karim.test.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karim.test.domain.PackageActivation;
import com.karim.test.dto.TransactionHistoryDto;
import com.karim.test.repositories.TransactionHistoryRepository;
import com.karim.test.services.TransactionHistoryService;

@RestController
@RequestMapping("/api/transaction/history")
public class TransactionResource {

	@Autowired
	TransactionHistoryService service;
	
	@GetMapping("/")
	public List<TransactionHistoryDto> retrieveAllTransaction(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public TransactionHistoryDto retrieveTransaction(@PathVariable Long id) {
		return service.getOne(id);
	}
	
}
