package com.karim.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karim.test.domain.PackageActivation;

public interface PackageRepository extends JpaRepository<PackageActivation, Long> {

}
