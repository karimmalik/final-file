package com.karim.test.dto;

import com.karim.test.domain.Transaction;

public class ActivationResponse {

	private Transaction transaction;
	private boolean iseligible;
	private String service_id_a;
	private String notification;
	
	public ActivationResponse() {

	}

	public ActivationResponse(Transaction transaction, boolean iseligible, String service_id_a,
			String notification) {
		super();
		this.transaction = transaction;
		this.iseligible = iseligible;
		this.service_id_a = service_id_a;
		this.notification = notification;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public boolean isIseligible() {
		return iseligible;
	}

	public void setIseligible(boolean iseligible) {
		this.iseligible = iseligible;
	}

	public String getService_id_a() {
		return service_id_a;
	}

	public void setService_id_a(String service_id_a) {
		this.service_id_a = service_id_a;
	}

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}
	
}
