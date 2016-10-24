package com.pick.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pick.model.ProductModel;
@Repository("ProductDao")
public  class ProductDaoImpl implements ProductDao 
{
	@Autowired
	private SessionFactory sessionFactory;
		public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public void insert(ProductModel product) 
	{
		// TODO Auto-generated method stub
			Session session = sessionFactory.openSession();
	        session.save(product);
	        session.flush();
	        session.close();
	}
	@Transactional
	public void update(ProductModel product) 
	{
		// TODO Auto-generated method stub
			Session session = sessionFactory.openSession();
	        session.update(product);
	        session.flush();
	        session.close();
	}
	@Transactional
	public void delete(ProductModel product) 
	{
		// TODO Auto-generated method stub
			Session session = sessionFactory.openSession();
	        session.delete(product);
	        session.flush();
	        session.close();
	}
	@Transactional
	public List<ProductModel> list1() 
	{
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<ProductModel> lists1=session.createQuery("from Products").list();
		
		return lists1;

		
	}

}
