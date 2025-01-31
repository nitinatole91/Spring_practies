package com.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring_Beans.xml");
		
		Motor b1= ac.getBean("motor",Motor.class);
		System.out.println(b1.hashCode());
		Motor b4= ac.getBean("motor",Motor.class);
		System.out.println(b4.hashCode());
		
		Car b2 = ac.getBean("car",Car.class);
		System.out.println(b2.hashCode());
		Car b3 = ac.getBean("car",Car.class);
		System.out.println(b3.hashCode());
		
	}

}
