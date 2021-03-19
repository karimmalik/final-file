package com.karim.test.domain;

import java.io.Serializable;

public class Transaction implements Serializable{
	private static final long serialVersionUID = 1L;

	private String transaction_id;
	private String channel;
	private String status_code;
	private String status_desc;

	public Transaction() {

	}

	public Transaction(String transaction_id, String channel, String status_code, String status_desc) {
		super();
		this.transaction_id = transaction_id;
		this.channel = channel;
		this.status_code = status_code;
		this.status_desc = status_desc;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}


	public String getStatus_code() {
		return status_code;
	}

	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}

	public String getStatus_desc() {
		return status_desc;
	}

	public void setStatus_desc(String status_desc) {
		this.status_desc = status_desc;
	}

}
