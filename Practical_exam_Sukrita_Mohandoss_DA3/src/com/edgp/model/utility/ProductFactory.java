package com.edgp.model.utility;

import com.edgp.model.business.ProductServiceImplementation;
import com.edgp.model.dao.CollectionBackedProductDao;

public class ProductFactory {
	
	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case DAO : 
			obj = new CollectionBackedProductDao();
			break;
		case SERVICE :
			obj = new ProductServiceImplementation();
			break;

		}
		return obj;
	}

}
