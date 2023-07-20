package com.jsp.LogicalProgramming;

public class Swap1 {
	public static void main (String args[]) {
		int a = 10 ; 
		int b = 20 ;
		
		// swap two numbers using 3rd variable
		int temp = a;
			a = b;
			b = temp ;
			
		System.out.println(a);
		System.out.println(b);

	}
}