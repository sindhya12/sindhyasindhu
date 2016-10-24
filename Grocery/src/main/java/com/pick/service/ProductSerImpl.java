package com.pick.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pick.Dao.ProductDao;
import com.pick.model.ProductModel;
@Service
public class ProductSerImpl implements ProductService
{
	private ProductDao pd1;
	

	public ProductDao getPd1() {
		return pd1;
	}

	public void setPd1(ProductDao pd1) {
		this.pd1 = pd1;
	}

	public void insert(ProductModel product) {
		// TODO Auto-generated method stub
		pd1.insert(product);
		
	}

	public void update(ProductModel product) {
		// TODO Auto-generated method stub
		pd1.update(product);
	}

	public void delete(ProductModel product) {
		// TODO Auto-generated method stub
		pd1.delete(product);
	}

	public List<ProductModel> list1() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
