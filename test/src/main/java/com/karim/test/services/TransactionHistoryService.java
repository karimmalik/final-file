package com.karim.test.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karim.test.domain.PackageActivation;
import com.karim.test.dto.TransactionHistoryDto;
import com.karim.test.repositories.TransactionHistoryRepository;

@Service
public class TransactionHistoryService {

	@Autowired
	TransactionHistoryRepository repository;
	
	public List<TransactionHistoryDto> findAll() {
		List<PackageActivation> packages = repository.findAll(); 
		List<TransactionHistoryDto> dtos = new ArrayList<TransactionHistoryDto>();
		
		for(int i=0; i<packages.size(); i++) {
			TransactionHistoryDto dto = new TransactionHistoryDto();
			dto.setActivationId(packages.get(i).getActivation_id());
			dto.setMsisdn(packages.get(i).getMsisdn());
			dto.setProductId(packages.get(i).getProduct_id());
			dto.setProductName(packages.get(i).getProduct_name());
			dto.setProductPrice(packages.get(i).getProduct_price());
			dtos.add(dto);
		}
		return dtos;
	}

	public TransactionHistoryDto getOne(Long id) {
		Optional<PackageActivation> packageActivation = repository.findById(id); 
		TransactionHistoryDto dto = new TransactionHistoryDto();
		dto.setActivationId(packageActivation.get().getActivation_id());
		dto.setMsisdn(packageActivation.get().getMsisdn());
		dto.setProductId(packageActivation.get().getProduct_id());
		dto.setProductName(packageActivation.get().getProduct_name());
		dto.setProductPrice(packageActivation.get().getProduct_price());
		return dto;
	}

}
