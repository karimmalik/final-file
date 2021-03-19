package com.karim.test.domain;

public class Offer {

	private Long id;
	private String name;
	private String highlight;
	private String menu_id;
	private String short_desc;
	private String long_desc;
	private String stock_type;
	private String terms;
	private long price;
	private int transfer_price;
	private boolean campaign_flag;
	private String product_length;
	private int offer_priority;
	private String promotional_flag;
	private String category;
	private String subcategory;
	private int adn;
	private String tag;
	private String product_family;
	private Bonus bonus;
	
	public Offer() {

	}

	public Offer(Long id, String name, String highlight, String menu_id, String short_desc, String long_desc,
			String stock_type, String terms, long price, int transfer_price, boolean campaign_flag,
			String product_length, int offer_priority, String promotional_flag, String category, String subcategory,
			int adn, String tag, String product_family, Bonus bonus) {
		super();
		this.id = id;
		this.name = name;
		this.highlight = highlight;
		this.menu_id = menu_id;
		this.short_desc = short_desc;
		this.long_desc = long_desc;
		this.stock_type = stock_type;
		this.terms = terms;
		this.price = price;
		this.transfer_price = transfer_price;
		this.campaign_flag = campaign_flag;
		this.product_length = product_length;
		this.offer_priority = offer_priority;
		this.promotional_flag = promotional_flag;
		this.category = category;
		this.subcategory = subcategory;
		this.adn = adn;
		this.tag = tag;
		this.product_family = product_family;
		this.bonus = bonus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHighlight() {
		return highlight;
	}

	public void setHighlight(String highlight) {
		this.highlight = highlight;
	}

	public String getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}

	public String getShort_desc() {
		return short_desc;
	}

	public void setShort_desc(String short_desc) {
		this.short_desc = short_desc;
	}

	public String getLong_desc() {
		return long_desc;
	}

	public void setLong_desc(String long_desc) {
		this.long_desc = long_desc;
	}

	public String getStock_type() {
		return stock_type;
	}

	public void setStock_type(String stock_type) {
		this.stock_type = stock_type;
	}

	public String getTerms() {
		return terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getTransfer_price() {
		return transfer_price;
	}

	public void setTransfer_price(int transfer_price) {
		this.transfer_price = transfer_price;
	}

	public boolean isCampaign_flag() {
		return campaign_flag;
	}

	public void setCampaign_flag(boolean campaign_flag) {
		this.campaign_flag = campaign_flag;
	}

	public String getProduct_length() {
		return product_length;
	}

	public void setProduct_length(String product_length) {
		this.product_length = product_length;
	}

	public int getOffer_priority() {
		return offer_priority;
	}

	public void setOffer_priority(int offer_priority) {
		this.offer_priority = offer_priority;
	}

	public String getPromotional_flag() {
		return promotional_flag;
	}

	public void setPromotional_flag(String promotional_flag) {
		this.promotional_flag = promotional_flag;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public int getAdn() {
		return adn;
	}

	public void setAdn(int adn) {
		this.adn = adn;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getProduct_family() {
		return product_family;
	}

	public void setProduct_family(String product_family) {
		this.product_family = product_family;
	}

	public Bonus getBonus() {
		return bonus;
	}

	public void setBonus(Bonus bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Offer2 [id=" + id + ", name=" + name + ", highlight=" + highlight + ", menu_id=" + menu_id
				+ ", short_desc=" + short_desc + ", long_desc=" + long_desc + ", stock_type=" + stock_type + ", terms="
				+ terms + ", price=" + price + ", transfer_price=" + transfer_price + ", campaign_flag=" + campaign_flag
				+ ", product_length=" + product_length + ", offer_priority=" + offer_priority + ", promotional_flag="
				+ promotional_flag + ", category=" + category + ", subcategory=" + subcategory + ", adn=" + adn
				+ ", tag=" + tag + ", product_family=" + product_family + "]";
	}
	
	
}
