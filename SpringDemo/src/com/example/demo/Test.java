package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("beans1.xml");
		BeanFactory f=new XmlBeanFactory(r);
		A a=(A)f.getBean("a");
		a.print();
		
	}

}
