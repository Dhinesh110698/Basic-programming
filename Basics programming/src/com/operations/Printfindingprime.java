package com.operations;

public class Printfindingprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i, number = 1, count; 
		while(number <= 100)
		{
			count = 0;
			i = 2;
		    while(i <= number/2 )
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    	i++;
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }
		    number++;

	}

}
}
