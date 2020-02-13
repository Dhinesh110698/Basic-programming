package com.operations;

public class Swapcharwithout3rdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char v1='Y';
		char v2='Z';
		v1=(char)(v1+v2);//
		v2=(char)(v1-v2);
		v1=(char)(v1-v2);
		
		System.out.println(v1);
		System.out.println(v2);
		

	}

}
