package com.communities.aem.core.service;

public class Product {

	private int id;
	private String name;
	private String category;
	private double unitPrice;
	private String prodimgpath;
	
	 public Product() {}
	
	 public Product(int id, String name, String category, double unitPrice, String prodimgpath) {
		 this.id = id;
		 this.name = name;
		 this.category = category;
		 this.unitPrice = unitPrice;
		 this.prodimgpath = prodimgpath;
	 }
	
	 public int getId() {
	
		 return id;
	 }
	
	 public void setId(int id) {
		 this.id = id;
	 }
	
	 public String getProdimgpath() {
		return prodimgpath;
	}

	public void setProdimgpath(String prodimgpath) {
		this.prodimgpath = prodimgpath;
	}

	public String getName() {
		 return name;
	 }
	
	 public void setName(String name) {
		 this.name = name;
	 }
	
	 public String getCategory() {
		 return category;
	 }
	
	 public void setCategory(String category) {
		 this.category = category;
	 }
	
	 public double getUnitPrice() {
		 return unitPrice;
	 }
	
	 public void setUnitPrice(double unitPrice) {
		 this.unitPrice = unitPrice;
	 }
 }