package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print numbers from 1 to 10;
       
		int num=1;
		
		
		while(num<=10) {
    	   System.out.println(num+" ");
    	   num++;
       }
		
		// print numbers from 1 to 10;
		
		int num1=1;
		
		while(num1<=10) {
			System.out.println(num1+" ");
			num1++;
		}
		
		//print numbers from 10 to 100;
		System.out.println();
		
		int a=10;
				
	while(a<=100) {
		System.out.println(a+" ");
		a++;
	}
	
	//print numbers from 10 to 1
	System.out.println();
	int b=10;
	
	while(b>=1) {
		System.out.println(b+" ");
		b--;
	}
	
	//print numbers from 100 to 50;
	
	System.out.println();
	int c=100;
	
	while(c>=50) {
		System.out.println(c+" ");
		c--;
	}
	
	//print numbers from -1 to -10;
	
	System.out.println();
	
	int d=-1;
	
	while(d>=-10) {
		System.out.println(d+" ");
		d--;
	}
	
	//print numbers from 1 to 20 but only even numbers
	System.out.println();
	// 1 way
	int e=2;
	while(e<=20) {
		System.out.print(e+" ");
		e+=2;
	}
	
	// 2 way
	
	int f=1;
	
	while(f<=20) {
		if (f % 2 == 0) {
			System.out.println(f + " ");
			
			f++;
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
