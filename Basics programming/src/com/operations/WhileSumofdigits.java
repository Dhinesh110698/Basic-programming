package com.operations;

public class WhileSumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int b=0;
	int a=563,n;
	while (a>0 )
		{
			n=a%10;
		a=a/10;
		b=b+n;
		}
		System.out.println(b);
		

	}

}
