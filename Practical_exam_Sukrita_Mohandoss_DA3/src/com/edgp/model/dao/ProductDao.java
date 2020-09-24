package com.edgp.model.dao;

import com.edgp.model.beans.Item;

public interface ProductDao {
	
	public Item store(Item item);
	public Item[] fetchReport();

}
