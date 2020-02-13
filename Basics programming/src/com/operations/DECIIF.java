package com.operations;

public class DECIIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		if(x>10 && x++<x++)
		{
			x++;
		}
		else if(x++ >10 || x++ <x++)
		{
		x--;
		}
		else
		{
			x++;
		}
System.out.println(x);
	}
}