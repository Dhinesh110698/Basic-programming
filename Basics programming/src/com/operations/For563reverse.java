package com.operations;

public class For563reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=0;
		int a=563;
		int c=563;
		for(int n;a>0; )
			{
				n=a%10;
				b=b*10+n;
			a=a/10;
			}
			System.out.println(b);
		
			if (c==b)
			{			
System.out.println(" palindrome");
	}
			else if (c!=b)
			{
				System.out.println("not palindrome");
			}
}}
