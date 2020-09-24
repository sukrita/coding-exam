package com.edgp.model.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.edgp.model.beans.Apparel;
import com.edgp.model.beans.Electronics;
import com.edgp.model.beans.FoodItems;
import com.edgp.model.beans.Item;

public class CollectionBackedProductDao implements ProductDao{
	
	private static Set<FoodItems> foodItemList = new TreeSet<FoodItems>();
	private static Set<Electronics> electronicsList = new TreeSet<Electronics>();
	private static Set<Apparel> apparelList = new TreeSet<Apparel>();

	
	//stores items in the set
	@Override
	public Item store(Item item) {
		// TODO Auto-generated method stub
		if(item instanceof FoodItems) 
			foodItemList.add((FoodItems)item);
		
		if(item instanceof Electronics) 
			electronicsList.add((Electronics)item);
		
		if(item instanceof Apparel) 
			apparelList.add((Apparel)item);
		
		
		return item;
	}
//fetches top 3 items
	@Override
	public Item[] fetchReport() {
		// TODO Auto-generated method stub

		
		return null;
	}

}
