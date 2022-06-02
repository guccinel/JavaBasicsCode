package com.syntax.class08;

public class LoopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		for(int i=1; i<6; i++) {
			sum+=i;
			//System.out.println(sum+" "); 1 3 6 10 15
		}
		System.out.println(sum);//15
		System.out.println("--------------------------");

	}

	
	/*
	 * write a program to find sum of all even and all odd numbers
	 * from 1 to 70
	 */
	 int sum=0;
	 for (int i=0;i<=70;i+=2) {
		sum+=i;
//		System.out.print(sum+" ");
		System.out.println();
	}
	System.out.println(sum+" ");
	
	
	
	for(int i=1;i<=70;i+=2) {
		sum+=i;
//		System.out.print(sum+"");
		System.out.println();
	}
	System.out.println(sum+" ");
	

}
