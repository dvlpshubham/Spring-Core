package com.springcore.spring.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spring/spel/config.xml");
		Demo d1 = context.getBean("demo", Demo.class);
		
		System.out.println(d1);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression =(Expression) temp.parseExpression("22+44");
		
		System.out.println(expression.getValue());
		

	}

}
