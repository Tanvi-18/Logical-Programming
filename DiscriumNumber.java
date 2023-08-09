package com.jsp.LogicalProgramming;

public class DiscriumNo {
	public static boolean isDiscrium(int n) {
		int count=0; int z=n; int sum=0;
		
		while(z>0) {
			z=z/10;
			count++;			
		}
		
		z=n;
		
		while(z>0) {
			int lastdigit = z%10;
			int prod=1;
			for(int i=1; i<=count; i++) {
				prod = prod*lastdigit;
			}
			count--;
			sum=sum+prod;
			z=z/10;
		}
		
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		System.out.println(isDiscrium(175));
	}

}