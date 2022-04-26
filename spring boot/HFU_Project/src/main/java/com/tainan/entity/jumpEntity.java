package com.tainan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stockList")
public class jumpEntity {

	@Id
	@Column
	private String product;
	
	
	@Column
	private String clasS;
	
	@Column
	private int ID ;
	@Column
	private int price;
	@Column
	private int stockQuantity;
	@Column
	private String photoName;
	
	
	
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public String getPhotoName() {
		return photoName;
	}
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
	public String getClasS() {
		return clasS;
	}
	public void setClasS(String clasS) {
		this.clasS = clasS;
	}
	
	
	
}
