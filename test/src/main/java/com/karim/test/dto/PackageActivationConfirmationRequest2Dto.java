package com.karim.test.dto;

public class PackageActivationConfirmationRequest2Dto {

	private String msisdn;
	private String productId;
	private String pin;
	
	public PackageActivationConfirmationRequest2Dto() {

	}

	public PackageActivationConfirmationRequest2Dto(String msisdn, String productId, String pin) {
		super();
		this.msisdn = msisdn;
		this.productId = productId;
		this.pin = pin;
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

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

}
