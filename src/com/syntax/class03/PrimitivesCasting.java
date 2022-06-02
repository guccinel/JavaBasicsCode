package com.syntax.class03;

public class PrimitivesCasting {

	//ctrl+space --> auto complete
	public static void main(String[] args) {
	 
		int i=100;
		double d=100;//widening 
		System.out.println(i);//100
		System.out.println(d);//100.0
		
		long l=1009878;
		//byte b=130; error: cannont convert from int to byte
		//int x=99.99 error: cannont convert from double to int
		
		//byte b=130
		
		//type mismtatch: cannot convert from double to int
		int x=(int)99.99; // narrowing
		System.out.println(x);//99
		
		//type mismatch: cannot convert from int to
		byte b=(byte)130;
		System.out.println(b);
		
		float f=10.99f;
		
		double dd=9.99;
		double price=100;
	}

}
