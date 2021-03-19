package com.karim.test.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "package_activation")
public class PackageActivation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long activation_id;
	private String transaction_id;
	private String msisdn;
	private String product_id;
	private String product_price;
	private String product_name;
	private String created_at;
	private int created_by;
	private String updated_at;
	private int updated_by;
	
	public PackageActivation() {

	}

	public PackageActivation(Long activation_id, String transaction_id, String msisdn, String product_id,
			String product_price, String product_name, String created_at, int created_by, String updated_at,
			int updated_by) {
		super();
		this.activation_id = activation_id;
		this.transaction_id = transaction_id;
		this.msisdn = msisdn;
		this.product_id = product_id;
		this.product_price = product_price;
		this.product_name = product_name;
		this.created_at = created_at;
		this.created_by = created_by;
		this.updated_at = updated_at;
		this.updated_by = updated_by;
	}

	public Long getActivation_id() {
		return activation_id;
	}

	public void setActivation_id(Long activation_id) {
		this.activation_id = activation_id;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getProduct_price() {
		return product_price;
	}

	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public int getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(int updated_by) {
		this.updated_by = updated_by;
	}

}
