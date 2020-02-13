package com.operations;

public class BingBang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=27 ;
if (a%3==0 && a%5==0)
{
	System.out.println("bing bang");
}
else if (a%3==0)
{
	System.out.println("bing");
} 
else if (a%5==0)
{
	System.out.println("bang");
}
else
{
	System.out.println(a);
}
	}

}
