package com.training.adijava8;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class LambdaDemo {

	public static void main(String[] args) {
		//int a=10;
		//int b=20;
		//sum(a,b);

	
	//private static int sum(int x, int y) {    //normal function def and calling above
		//return x+y;
	
	//MyInterface obj = (x, y) -> x+y;    //lambda function syntax, returns only functional interface
	//System.out.println(obj.getSum(30, 40));   //lambda replaces normal function calling
	
	CompStrings obj1 = (str1, str2) -> str1.equals(str2);    //lambda function syntax, returns only functional interface
	System.out.println(obj1.compareStr("abcd", "abc"));
	
	
	BiPredicate <String, String> obj2 = (str1, str2) -> str1.equals(str2);
	System.out.println (obj2.test("abcd", "abc"));
	
	BiConsumer <String, String> obj3 = (str1, str2) -> System.out.println(str1+", "+str2);
	obj3.accept("abc", "abcd");
	}

}
