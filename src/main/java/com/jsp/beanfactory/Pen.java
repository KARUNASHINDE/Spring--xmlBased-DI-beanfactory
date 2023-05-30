package com.jsp.beanfactory;

public class Pen {
	private String brand;
	private String color;
	private int Price;
	
	Pen(){
		System.out.println("Pen object created by Spring");
	}
public void write() {
	System.out.println("Pen is WOrking fine");
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColor() {	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	this.Price = price;
}
}
