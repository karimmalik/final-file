package com.karim.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karim.test.domain.PackageActivation;
import com.karim.test.dto.TransactionHistoryDto;

public interface TransactionHistoryRepository extends JpaRepository<PackageActivation, Long>{

}
