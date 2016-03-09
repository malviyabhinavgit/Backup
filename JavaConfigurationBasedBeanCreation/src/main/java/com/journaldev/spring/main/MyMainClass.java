package com.journaldev.spring.main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = MyConfiguration.class)
public class MyMainClass {

	@Autowired
	private MyService service;

	@Test
	public void testService() {
		service.log("finally Did It");
	}
	// public static void main(String[] args) {
	// }
	//
	// AnnotationConfigApplicationContext ctx = new
	// AnnotationConfigApplicationContext(
	// MyConfiguration.class);
	// MyService service = ctx.getBean(MyService.class);
	//
	// service.log("Hi");
	//
	// MyService newService = ctx.getBean(MyService.class);
	// System.out.println("service hashcode="+service.hashCode());
	// System.out.println("newService hashcode="+newService.hashCode());
	// ctx.close();
	// }

}
