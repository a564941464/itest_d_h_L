package com.tandlol.dhlapi;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Book {
	String id;
	String name;
	int price;
	

	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@XmlAttribute  
	public String getId() {
		return id;
	}@XmlElement 
	public String getName() {
		return name;
	}@XmlElement 
	public int getPrice() {
		return price;
	}

}
