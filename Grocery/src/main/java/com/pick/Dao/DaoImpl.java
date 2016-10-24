package com.pick.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pick.model.UserModel;

@Repository("UserDao")
public  class DaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;
 
 
    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	/*
	@Transactional
    public void save(UserModel user) {
        Session session = sessionFactory.openSession();
        session.save(user);
        session.flush();
        session.close();
        
    }
	
    @Transactional
     public void Update(UserModel user) 
    {
    	System.out.println("inside update");
    	Session session = sessionFactory.openSession();
    	System.out.println("inside update after object");
        session.update(user);
        System.out.println("inside update after function");
        session.flush();
        session.close();
        
    }
    
	@SuppressWarnings("unchecked")
	public List<UserModel> list() {
		Session session=sessionFactory.openSession();
		List<UserModel> lists=session.createQuery("from User").list();
		
		return lists;
	}*/
	@Transactional
	public void delete(UserModel user) {
		 
		Session session = sessionFactory.openSession();
        session.delete(user);
        session.flush();
        
        
	}
}
