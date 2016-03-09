package com.journaldev.spring.main;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class MyService {

	public void log(String msg){
		System.out.println(new Date()+"::"+msg);
	}
}
