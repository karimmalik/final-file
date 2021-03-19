package com.karim.test.dto;

import java.io.Serializable;

public class PackageActivationRequestDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String token;
	private String msisdn;
	private String productId;
	
	public PackageActivationRequestDto() {

	}

	public PackageActivationRequestDto(String token, String msisdn, String productId) {
		super();
		this.token = token;
		this.msisdn = msisdn;
		this.productId = productId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "{ "
				+ "token : " + token + ","
				+ "msisdn : " + msisdn + "," 
				+ "productId : " + productId
				+ "}";
	}	
	
}
