package com.karim.test.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.karim.test.Constants;
import com.karim.test.dto.PackageActivationRequestDto;

@Repository
public class PackageActivationRepository {

	@Autowired
    private RedisTemplate template;
	
    // digunakan menyimpan data package
	// digunakan ketika melakukan initiate package activation
    public ResponseEntity<PackageActivationRequestDto> save(PackageActivationRequestDto product){
    	UUID uuid = UUID.randomUUID();
    	String stringUuid = uuid.toString();
    	product.setToken(stringUuid);
    	
        template.opsForHash().put(Constants.PACKAGEACTIVATION, product.getToken(),product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    
    // digunakan mencari data package 
    public List<PackageActivationRequestDto> findAll(){
        return template.opsForHash().values(Constants.PACKAGEACTIVATION);
    }

    // digunakan mencari data package detail
    public PackageActivationRequestDto findProductById(String id){
    	PackageActivationRequestDto packageDto = new PackageActivationRequestDto();
    	packageDto.setToken(id);
        return (PackageActivationRequestDto) template.opsForHash().get(Constants.PACKAGEACTIVATION,packageDto.getToken());
    }

}
