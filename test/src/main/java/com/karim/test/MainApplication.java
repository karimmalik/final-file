package com.karim.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.karim.test.dto.PackageActivationRequestDto;
import com.karim.test.dto.PackageActivationResponseDto;
import com.karim.test.filters.AuthFilter;
import com.karim.test.resources.PackageActivationResource;
import com.karim.test.services.PackageActivationService;

@SpringBootApplication
public class MainApplication {

//	@Autowired
//	InitiaitePackageActivationService service;
//	
//	@PostMapping
//    public ResponseEntity<PackageActivationRequest> save(@RequestBody PackageActivationRequest product) {
//        return service.save(product);
//    }
//
//    @GetMapping
//    public List<PackageActivationRequest> getAllProducts() {
//        return service.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public PackageActivationRequest findProduct(@PathVariable int id) {
//        return service.findProductById(id);
//    }
//    @DeleteMapping("/{id}")
//    public String remove(@PathVariable int id)   {
//    	return service.deleteProduct(id);
//	}

    private PackageActivationResource restService;

//    public MainApplication(PackageActivationResource restService) {
//        this.restService = restService;
//    }
    
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
       // Do any additional configuration here
       return builder.build();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<CorsFilter> corsFilter() {
		FilterRegistrationBean<CorsFilter> registrationBean = new FilterRegistrationBean<>();
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		source.registerCorsConfiguration("/**", config);
		registrationBean.setFilter(new CorsFilter(source));
		registrationBean.setOrder(0);
		return registrationBean;
	}
	

	@Bean
	public FilterRegistrationBean<AuthFilter> filterRegistrationBean() {
		FilterRegistrationBean<AuthFilter> registrationBean = new FilterRegistrationBean<>();
		AuthFilter authFilter = new AuthFilter();
		registrationBean.setFilter(authFilter);
		registrationBean.addUrlPatterns("/api/product/*", "/api/package-activation/*", "/api/transaction/*");
		return registrationBean;
	}

}
