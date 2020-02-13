package com.operations;

public class Printingmultiplyof3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		while(n<=20)
		{
			if (n%3==0)
			{
		System.out.println("mutiply of 3="+n);
			}
			if (n%5==0)
			{
		System.out.println("mutiply of 5="+n);
			}
		if ((n%3==0)&&(n%5==0))
		{
	System.out.println("mutiply of 3 and 5="+n);
		}
n++;
	}
		

}
}