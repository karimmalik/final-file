package com.karim.test.dto;

public class PackageActivationConfirmationRequestDto {

	private String token;
	private String pin;
	
	public PackageActivationConfirmationRequestDto() {

	}

	public PackageActivationConfirmationRequestDto(String token, String pin) {
		super();
		this.token = token;
		this.pin = pin;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
}
