package com.pick.ControlConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext appobj = new AnnotationConfigApplicationContext(); 
		System.out.println("APP");
		appobj.scan("com.pick.grocery");
		appobj.refresh();
		
	}
}
