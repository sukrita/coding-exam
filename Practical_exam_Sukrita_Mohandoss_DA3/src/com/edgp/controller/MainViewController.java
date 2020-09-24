package com.edgp.controller;

import java.util.Scanner;

import com.edgp.model.beans.Apparel;
import com.edgp.model.beans.Electronics;
import com.edgp.model.beans.FoodItems;
import com.edgp.model.beans.Item;
import com.edgp.model.business.ProductService;
import com.edgp.model.utility.ProductFactory;
import com.edgp.model.utility.Type;

/*
 * Sukrita
 * View Layer
 */



public class MainViewController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		ProductService service = (ProductService) ProductFactory.getInstance(Type.SERVICE);
		
		int option = 0;
		do {
			System.out.println("********************************");
			System.out.println("1: Store 2: Retreive 3: Exit");
			System.out.println("********************************");
			option = scanner.nextInt();
			switch(option) {
			//Store items
			case 1: 
				String category;
				System.out.println("Enter category:");
				category = scanner.next();
				Item item = null;
				
				
				switch(category) {
				
				case "food item":
					System.out.println("Enter item code, item name, unit price, quantity ");
					FoodItems foodItem = new FoodItems(scanner.nextInt(), scanner.next(), scanner.nextDouble(), scanner.nextLong()); 
					item = foodItem;
					break;
					
				case "electronics":
					
					System.out.println("Enter item code, item name, unit price, quantity and warranty");
					Item electronics = new Electronics(scanner.nextInt(), scanner.next(), scanner.nextDouble(), scanner.nextLong(), scanner.nextInt());
					item = electronics;
					break;
				case "apparel":
					
					System.out.println("Enter item code, item name, unit price, quantity, size and material");
					Item apparel = new Apparel(scanner.nextInt(), scanner.next(), scanner.nextDouble(), scanner.nextLong(), scanner.next(), scanner.next());
					item = apparel;
					break;
				
				}
				//retreive top 3 items
			case 2:
				
			
				break;

			}	
				
				
			
		} while(option != 6);
		
		scanner.close();
		
		

	}

}
