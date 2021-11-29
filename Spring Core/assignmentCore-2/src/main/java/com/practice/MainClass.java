package com.practice;

import java.util.*;

import com.practice.Answer;
import com.practice.Question;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
	Question qes = (Question)con.getBean("qtn");
	System.out.print ("Q - "+qes.getQid()+")  ");
	
	System.out.println(qes.getQuestion());
	System.out.println();
	Answer ans =qes.getAns();
	List <String > l = ans.getL();
	System.out.println("-------------------All Answer from List---------------");
	l.forEach(System.out::println);
	System.out.println("-------------------All Answer from Set---------------");
	ans.getS().forEach(System.out::println);
	System.out.println("-------------------All Answer from Map---------------");
	System.out.println(ans.getMp());
	
}
}
