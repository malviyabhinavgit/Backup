package com.spring.learning.configuration.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.learning.configuration.MyAppConfig;
import com.spring.learning.java.based.configuration.MyColor;

public class Demo {
	public static void main(String args[]){
        ApplicationContext context
                        = new AnnotationConfigApplicationContext(MyAppConfig.class);
        MyColor color = (MyColor) context.getBean("myColorBean");
        color.printColor();
    }


}
