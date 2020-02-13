package com.operations;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// should not used third variable
		int a=5;
	    int b=6;
	    int c=7;
	    a=(a+b+c);//18
	    b=a-(b+c);//5
	    c=a-(b+c);//6
	    a=a-(b+c);//7
	     System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	}

}
