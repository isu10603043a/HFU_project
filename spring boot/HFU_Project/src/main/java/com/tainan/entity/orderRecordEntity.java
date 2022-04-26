package com.tainan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderRecord")
public class orderRecordEntity {

	public orderRecordEntity() {
		
	}
	
	@Id
	@Column
	private String productName;
	@Column
	private int purchaseQuantity;
	
	
	



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public int getPurchaseQuantity() {
		return purchaseQuantity;
	}



	public void setPurchaseQuantity(int purchaseQuantity) {
		this.purchaseQuantity = purchaseQuantity;
	}



	public orderRecordEntity(String productName, int purchaseQuantity) {
		this.productName = productName;
		this.purchaseQuantity = purchaseQuantity;
	}



	@Override
	public String toString() {
		return "orderRecordEntity [productName=" + productName + ", purchaseQuantity=" + purchaseQuantity + "]";
	}
	

	
	

	
	
}
