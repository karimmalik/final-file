package com.karim.test.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.karim.test.domain.PackageActivation;
import com.karim.test.repositories.PackageRepository;

@RestController
public class PackageResource {

	@Autowired
	PackageRepository repository;
	
	@GetMapping("/package")
	public List<PackageActivation> retrieveAllPackage() {
		return repository.findAll();
	}
	
	@GetMapping("/package/{id}")
	public PackageActivation retrieveEmployeeId(@PathVariable Long id) {
		Optional<PackageActivation> packageDetail = repository.findById(id);
		return packageDetail.get();
	}	
}
