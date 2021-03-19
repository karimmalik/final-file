package com.karim.test.domain;

public class Bonus {

	private String subclass;
	private String name;
	private String quota;
	private String validity_period;
	private boolean highlight;

	public Bonus() {
		// TODO Auto-generated constructor stub
	}

	public Bonus(String subclass, String name, String quota, String validity_period, boolean highlight) {
		super();
		this.subclass = subclass;
		this.name = name;
		this.quota = quota;
		this.validity_period = validity_period;
		this.highlight = highlight;
	}

	/**
	 * @return the subclass
	 */
	public String getSubclass() {
		return subclass;
	}

	/**
	 * @param subclass the subclass to set
	 */
	public void setSubclass(String subclass) {
		this.subclass = subclass;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the quota
	 */
	public String getQuota() {
		return quota;
	}

	/**
	 * @param quota the quota to set
	 */
	public void setQuota(String quota) {
		this.quota = quota;
	}

	/**
	 * @return the validity_period
	 */
	public String getValidity_period() {
		return validity_period;
	}

	/**
	 * @param validity_period the validity_period to set
	 */
	public void setValidity_period(String validity_period) {
		this.validity_period = validity_period;
	}

	/**
	 * @return the highlight
	 */
	public boolean isHighlight() {
		return highlight;
	}

	/**
	 * @param highlight the highlight to set
	 */
	public void setHighlight(boolean highlight) {
		this.highlight = highlight;
	}

	@Override
	public String toString() {
		return "Bonus [subclass=" + subclass + ", name=" + name + ", quota=" + quota + ", validity_period="
				+ validity_period + ", highlight=" + highlight + "]";
	}
	
	
	
}
