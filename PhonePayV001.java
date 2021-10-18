package com.xworks.arrayOfObjects;

public class PhonePayV001 {
String name;
String version;
int releaseYear;

public PhonePayV001(String name,String version,int releaseYear) {
	this.name=name;
	this.version=version;
	this.releaseYear=releaseYear;
}

public void login() {
	System.out.println("Login successful");
}
public void logout() {
	System.out.println("LogOut Successful");
}
public void scanAndPay(){
	System.out.println("Payment successful");	
}
public void moneyTransfer() {
	System.out.println("Transfer Successful");
}
public void electricity() {
	System.out.println("Electricity Payment successful");
}
}
