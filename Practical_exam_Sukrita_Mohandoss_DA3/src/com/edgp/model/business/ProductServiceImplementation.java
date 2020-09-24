package com.edgp.model.business;

import com.edgp.exception.ItemCodeExists;
import com.edgp.exception.ReportNotFound;
import com.edgp.model.beans.Item;
import com.edgp.model.dao.ProductDao;
import com.edgp.model.utility.ProductFactory;
import com.edgp.model.utility.Type;

/*
 * Sukrita
 * Service Layer of the program
 */


public class ProductServiceImplementation implements ProductService{
	
	private ProductDao dao;
	
	public ProductServiceImplementation() {
		// this is the way you get different instance
		dao = (ProductDao)ProductFactory.getInstance(Type.DAO);
	}

// stores item
	@Override
	public Item storeItem(Item item) throws ItemCodeExists{
		// TODO Auto-generated method stub
		Item createdItem =  dao.store(item);
		return createdItem;
		
	}
//returns report of top 3 items
	@Override
	public Item[] report() throws ReportNotFound {
		// TODO Auto-generated method stub
		return dao.fetchReport();
	}

}
