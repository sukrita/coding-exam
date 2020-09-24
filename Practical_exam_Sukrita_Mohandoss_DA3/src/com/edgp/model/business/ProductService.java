package com.edgp.model.business;

import com.edgp.exception.ItemCodeExists;
import com.edgp.exception.ReportNotFound;
import com.edgp.model.beans.Item;

public interface ProductService {
	
	public Item storeItem(Item item) throws ItemCodeExists;
	
	public Item[] report() throws ReportNotFound;

}
