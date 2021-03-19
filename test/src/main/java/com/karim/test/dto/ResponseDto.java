package com.karim.test.dto;

import org.springframework.http.HttpStatus;

public class ResponseDto {

	private HttpStatus status;
	
	public ResponseDto() {

	}

	public ResponseDto(HttpStatus status) {
		super();
		this.status = status;
	}


	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
}
