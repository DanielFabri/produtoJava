package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price");
		double  price = sc.nextDouble();	
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Update Name ;"+ product.getName());
		product.setPrice(1200);
		System.out.println("Upadate Price" +  product.getPrice());
		
		
		System.out.println();
		System.out.println("Product Data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock:");
		int quatity = sc.nextInt();
		product.addProducts(quatity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock:");
		quatity = sc.nextInt();
		product.removeProducts(quatity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		
		sc.close();
	}

}
