package com.operations;

public class Armstrong {

	public static void main(String[] args) {
		int a=253;
		int b;
		int c=a%10;
		a=a/10;
		int d=a%10;
		a=a/10;
		int e=a;
		int x=(c*c*c);
		int y=(d*d*d);
		int z=(e*e*e);
		b=(x+y+z);
		System.out.println(b);
		

	}

}
