package main;

public class Variable {
	double price;
	String brand, type;
	static int count = 0;
	final double tax = 0.085;


	public Variable() {
		 price = 30000;
		 brand = "Honda";
		 type = "Coupe";
		 count ++;
		 
	 }

	 public Variable(double price, String brand) {
		 count++;
		 this.price = price;
		 this.brand = brand;
		 
	 }

	public Variable(double price, String brand, String type) {
		count++;
		this.price = price;
		this.brand = brand;
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	 
	 public static int getCount() {
		return count;
	}

	public double checkoutVariavble() {
		double totalPrice;
		totalPrice = this.price +(this.price * tax);
		System.out.println("the total checkout of the  " + this.brand +  this.type + " is $ " + totalPrice );
		return totalPrice;
		
		
	}
}
