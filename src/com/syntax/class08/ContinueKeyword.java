package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// continue - skip current execution/iteration
		
		for (int i=1; i<=5; i++) {
			if(i==2) {
				continue;
				
			}
			System.out.println(i+" ");
			System.out.println("Hello");
			System.out.println("We are going on break soon");
		}
		
		//print numbers from 1 to 10 except number 5 and 7 
		
		for (int i=1; i<=10; i++) {
			
			if (i==5||i==7) {
				continue;
			}
			System.out.println(i+" ");
		}

	}

}
