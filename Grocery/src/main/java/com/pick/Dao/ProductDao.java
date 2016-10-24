package com.pick.Dao;

import java.util.List;

import com.pick.model.ProductModel;


public interface ProductDao
{
	public void insert(ProductModel product);
	public void update(ProductModel product);
	public void delete(ProductModel product);
	public List<ProductModel> list1();

}
