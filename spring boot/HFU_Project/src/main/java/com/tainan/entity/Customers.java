package com.tainan.entity;

public class Customers {

	private int id ,price ;
	private String  product , photo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	@Override
	public String toString() {
		return "Customers [id=" + id + ", price=" + price + ", product=" + product + ", photo=" + photo + "]";
	}
	
	
	
	
}
