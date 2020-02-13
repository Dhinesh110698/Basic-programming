package com.operations;

public class PrintingFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact=1;
		int i=1;
		int number=5;
		while(i<=number)
		{
			
			fact=fact*i;
			
			i++;
		}
System.out.println(fact);
	}

}
