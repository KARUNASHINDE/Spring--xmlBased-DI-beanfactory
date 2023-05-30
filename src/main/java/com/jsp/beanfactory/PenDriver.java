package com.jsp.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class PenDriver {

	public static void main(String[] args) {
//		using BeanFactory
		ClassPathResource classPathResource = new ClassPathResource("myspring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		Pen pen = (Pen) beanFactory.getBean("myPen");

		pen.write();
		System.out.println("pen BrandName is : " + pen.getBrand());
		System.out.println("Pen Color is : " + pen.getColor());
		System.out.println("Pen price is : " + pen.getPrice());

		System.out.println("..Using Application context..");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		Pen pen1 = (Pen) applicationContext.getBean("myPen");
		pen.write();

		System.out.println("pen BrandName is : " + pen.getBrand());
		System.out.println("Pen Color is : " + pen.getColor());
		System.out.println("Pen price is : " + pen.getPrice());



	}
}
