package com.operations;

public class Ageminorcalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-18;
		if (a<=-1)
		{
			System.out.println("invalid");
		}
		else if (a>=60)
		{
		System.out.println("senior citizen");	
		}
		else if (a>=18)
		{
			System.out.println("major");
		}
		else if (a<18)
		{
			System.out.println("minor");
		}
	}

}
