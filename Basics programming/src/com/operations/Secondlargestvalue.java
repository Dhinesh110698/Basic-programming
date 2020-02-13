package com.operations;

/**
 * @author DSP Dhinesh
 *
 */
public class Secondlargestvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11,b=23,c=36;
		
		if (a>=b && a>=c)
		{
			if (b>=c)
			{
				System.out.println(b);
			}
			else
			{
		System.out.println(c);
	}
}
		else if  (b>=a && b>=c)
		{ 
		if (a>=c)
		{
			System.out.println(a);
			}
		else
		{
			System.out.println(c);
		}
		}
		else if(a>=b)
		{
			System.out.println(a);
		}
			else
			{
				System.out.println(b);
			}
			
			}
		}
	
