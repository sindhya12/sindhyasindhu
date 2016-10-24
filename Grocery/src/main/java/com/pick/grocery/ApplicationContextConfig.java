package com.pick.grocery;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.pick.Dao.DaoImpl;
import com.pick.Dao.UserDao;
import com.pick.model.ProductModel;
import com.pick.model.UserModel;

@Configuration
@ComponentScan("com.pick.model")
@EnableTransactionManagement
public class ApplicationContextConfig
{

	@Bean(name = "dataSource")
	public DataSource getDataSource() 
	{
	  
	 BasicDataSource dataSource = new BasicDataSource();
	 dataSource.setDriverClassName("org.h2.Driver");
	 dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
	 dataSource.setUsername("sa");
	 dataSource.setPassword("sa");
	  return dataSource;
	
	}
	
	private Properties getHibernateProperties() 
	{
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		return properties;
	}	
	
	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) 
	{
			
			
		
	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	sessionBuilder.addProperties(getHibernateProperties());
	
		System.out.println("BEFORE");
		sessionBuilder.addAnnotatedClasses(UserModel.class);

		sessionBuilder.addAnnotatedClasses(ProductModel.class);

		
		System.out.println("AFTER");
		return sessionBuilder.buildSessionFactory();
	}
	
	
	
	
	
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) 
	{
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
	@Autowired
	@Bean(name = "udao")
	public UserDao getUserDao()
	{
		return new DaoImpl();
	}
	/*
	@Autowired
	@Bean(name = "pdao")
	public ProductDao getProductDao()
	{
		return new ProductDaoImpl();
	}*/
}
