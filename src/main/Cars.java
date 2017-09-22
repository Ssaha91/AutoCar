package main;

public class Cars {

	public static void main(String[] args) {
		
		
		Variable araf = new Variable();
		System.out.println(araf.getPrice());
		
		Variable Nirob = new Variable(50000, "Toyota");
		System.out.println(Nirob.getBrand());
		//System.out.println(Nirob.getPrice());
		
		Nirob.setPrice(700000);
		System.out.println(Nirob.getPrice());
		
		Variable saha = new Variable(100000, "BMW", "sub");
		System.out.println(saha.getType());
		//System.out.println(saha.brand);
		saha.setBrand("Audi");
		System.out.println(saha.getBrand());
		
		System.out.println(Variable.getCount());
		saha.checkoutVariavble();
		 

	}

}
