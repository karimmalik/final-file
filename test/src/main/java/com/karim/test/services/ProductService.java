package com.karim.test.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.karim.test.Constants;
import com.karim.test.domain.Offer;
import com.karim.test.dto.ProductDto;

@Service
public class ProductService {

	@Autowired
    private RedisTemplate template;
	
	public List<ProductDto> retrieveProduct() {
		List<Offer> response = new ArrayList<Offer>();
		
		try {
		
			String url = "http://dev3.dansmultipro.co.id/mock/preprod-web/scrt/esb/v1/offer/reseller?menu_id=ML3_DP_03";
			
			RestTemplate restTemplate = new RestTemplate();
			
			ResponseEntity<String> result = restTemplate.getForEntity(url, String.class);
			
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Map<String, List<String>>> map = mapper.readValue(result.getBody().toString(), Map.class);
			
			List<Map<String, List<String>>> offers = (List<Map<String, List<String>>>) map.get("offer");
			List<ProductDto> productDtoList= new ArrayList<ProductDto>();
			for(int i=0; i<offers.size(); i++) {
				ProductDto productDto = new ProductDto();
			
				List list = new ArrayList<>();
				list.add(offers.get(i).get("id"));
				list.add(offers.get(i).get("name"));
				list.add(offers.get(i).get("price"));
				
				String id = list.get(0).toString();
				String name = list.get(1).toString();
				String price = list.get(2).toString();
				
				productDto.setId(id);
				productDto.setName(name);
				productDto.setPrice(price);
				
				template.opsForHash().put(Constants.PRODUCT, productDto.getId(),productDto);
				productDtoList.add(productDto);

			}

			return productDtoList;
		
		} catch (Exception e) {
			System.out.println("exc : " + e);
		}
		    
		return null;
	}
	
}
