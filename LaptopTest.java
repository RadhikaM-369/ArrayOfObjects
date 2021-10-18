package com.xworks.arrayOfObjects;

public class LaptopTest {
	public static void displayInfo(Laptop objs[]) {
		System.out.println("Laptop Information");
		for(int i=0;i<objs.length;i++) {
			if(objs[i].ramSize>=4) {
				System.out.println("Laptop Information");
				System.out.println(objs[i].brand);
				System.out.println(objs[i].price);
				System.out.println(objs[i].color);
				System.out.println(objs[i].ramSize);
				System.out.println("-------------------------");
			}
		}
	}

	public static void main(String[] args) {
		Laptop LP1= new Laptop("HP", 34000,"Black",4);
		Laptop LP2= new Laptop("HP", 42000,"White",8);
		Laptop LP3= new Laptop("DELL",36000,"Black",4);
		Laptop LP4= new Laptop("HP", 44000,"Black",16);
		Laptop LP5= new Laptop("Acer", 52000,"Black",8);

		
		Laptop objs[]= {LP1,LP2,LP3,LP4};
		LaptopTest.displayInfo(objs);
	}

}
