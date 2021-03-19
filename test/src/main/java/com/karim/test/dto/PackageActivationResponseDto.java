package com.karim.test.dto;

import org.springframework.http.HttpStatus;

public class PackageActivationResponseDto {

	private String token;
	private HttpStatus status;
	
	public PackageActivationResponseDto() {

	}

	public PackageActivationResponseDto(String token, HttpStatus status) {
		super();
		this.token = token;
		this.status = status;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

}
