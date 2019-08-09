package com.harshit.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringClient {

	public static void main(String[] args) {
		//Resource resource = new ClassPathResource("beans.xml");
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("masterBean.xml");
		
		//BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Customer customer = (Customer)context.getBean("cust");
		
		System.out.println(customer.toString());
		context.registerShutdownHook();
		
		
		
	}
}
