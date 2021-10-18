package com.xworks.arrayOfObjects;

public class Laptop {
String brand;
int price;
String color;
int ramSize;

public Laptop(String brand,int price,String color,int ramSize) {
	this.brand=brand;
	this.color=color;
	this.price=price;
	this.ramSize=ramSize;
}

public void On() {
	System.out.println("Laptop is On");
}
public void coding() {
	System.out.println("User can write codes");
}
public void playGames() {
	System.out.println("user can play games");
}
public void playVideo() {
	System.out.println("Play videos here");
}
}
