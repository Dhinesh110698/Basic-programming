package com.operations;

public class Combine {

	public static void main(String[] args) {
		int a=753;
		int b;
		int c=a%10;
		a=a/10;
		int d=a%10;
		a=a/10;
		int e=a;
		int x=(c*100);
		int y=(d*10);
		int z=(e*1);
		b=(x+y+z);
		System.out.println(b);

	}

}
