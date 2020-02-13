 package com.operations;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pi=3.14f,half=0.5f;
		int r=2,h=3,a=4,cube;
		float circle,cylinder,cone,semicircle;
		circle=(pi*(r*r));//pi r^2
		cylinder=((2*pi*r*h)+(2*pi*(r*r)));//2 pi r h+2 pi r^2
	    cube=(6*(a*a));//6a^2
	    semicircle=(half*pi*(r*r));//(1/2)pi r^2
	    cone=(pi*(r*r)*(half/3));//pi r^2 (h/3)
	    System.out.println("Area of circle ="+circle);
	    System.out.println("Area of cylinder ="+cylinder);
	    System.out.println("Area of cube ="+cube);
	    System.out.println("Area of semicircle ="+semicircle);
	    System.out.println("volume of cone ="+cone);
		
int x=10;
System.out.println(x<10 && x++>10);
System.out.println(x);
int y=2;
System.out.println(y>2 || y++>2);
System.out.println(y);
	}

}
