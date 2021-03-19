package com.karim.test.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class TransactionHistoryDto {

	private long activationId;
	private String msisdn;
	private String productId;
	private String productName;
	private String productPrice;
	
	public TransactionHistoryDto() {
		// TODO Auto-generated constructor stub
	}

	public TransactionHistoryDto(long activationId, String msisdn, String productId, String productName,
			String productPrice) {
		super();
		this.activationId = activationId;
		this.msisdn = msisdn;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public long getActivationId() {
		return activationId;
	}

	public void setActivationId(long activationId) {
		this.activationId = activationId;
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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "TransactionHistoryDto [activationId=" + activationId + ", msisdn=" + msisdn + ", productId=" + productId
				+ ", productName=" + productName + ", productPrice=" + productPrice + "]";
	}
		
}
