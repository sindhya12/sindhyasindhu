package com.pick.service;

import java.util.List;

import com.pick.model.ProductModel;

public interface ProductService 
{
	public void insert(ProductModel product);
	public void update(ProductModel product);
	public void delete(ProductModel product);
	public List<ProductModel> list1();

}
