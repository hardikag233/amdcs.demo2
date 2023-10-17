package com.training.adijava8;

import java.util.Objects;

public class Product {
	private int prodId;
	private String prodName;
	private String prodCategory;
	private int price;
	
	public Product(int prodId, String prodName, String prodCategory, int price) {
		this.prodId = prodId;
		this.prodName=prodName;
		this.prodCategory=prodCategory;
		this.price=price;
	}
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCategory=" + prodCategory + ", price="
				+ price + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(price, prodCategory, prodId, prodName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return price == other.price && Objects.equals(prodCategory, other.prodCategory) && prodId == other.prodId
				&& Objects.equals(prodName, other.prodName);
	}

	
	
}


