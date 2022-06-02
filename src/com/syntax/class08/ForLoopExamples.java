package com.syntax.class08;

public class ForLoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// I need to print numbers from 1 to 90
		
		for (int i=1; i<=90; i++) {
			System.out.println(i+" ");
		}
		
		
		/* start point 1
		 * end point 90
		 * increment/decrement
		 */
        
		
		// i need numbers from 60 to 10
		
		for (int i=60; i>=10; i--) {
			System.out.println(i+" ");
	}
		System.out.println("-------------------");
		
		
		// what is the output? 
		
		for(int i=5; i<=40; i+=5) {
			System.out.println(i+" ");
		}
		
		System.out.println("------------------------------------");
		
		
		// TASK
		// //Print numbers from 1 to 100 in 1 line space
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		//Print numbers 100 to 1
		
		for(int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		//Print even numbers from 20 to 1(2 ways)
		
		for(int i=20; i>=1; i-=2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		//Print odd numbers between 20 to 50(2 ways)
		
		for(int i=21; i<=50; i+=2) {
			System.out.print(i+" ");
		}
		
		
		
		
		

}
}
