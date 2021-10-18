package com.xworks.arrayOfObjects;

public class EndUser {
public static void displayInfo(PhonePayV001 objs[]) {
	System.out.println("Phone Pay Information");
	for(int i=0; i<objs.length;i++) {
		System.out.println(objs[i].name);
		System.out.println(objs[i].version);
		System.out.println(objs[i].releaseYear);
		System.out.println("------------------------");
	}
}
public static void main(String args[]) {
	PhonePayV001 phonepayv001=new PhonePayV001("PhonePay","V001",2016);
	PhonePayV001 phonepayv0012=new PhonePayV001("PhonePay","V002",2017);
	PhonePayV001 phonepayv0013=new PhonePayV001("PhonePay","V003",2018);
	PhonePayV001 phonepayv0014=new PhonePayV001("PhonePay","V004",2019);
	PhonePayV001 phonepayv0015=new PhonePayV001("PhonePay","V005",2020);
	
	PhonePayV001 objs[]= {phonepayv001,phonepayv0012,phonepayv0013};
	EndUser.displayInfo(objs);
	}
}
