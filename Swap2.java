package com.jsp.LogicalProgramming;

public class Swap2 {
	public static void main(String args []) {
		int a = 10;
		int b = 20;
		
		// to swap without using 3rd variable
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a);
		System.out.println(b);
		
	}

}