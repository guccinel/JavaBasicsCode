package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print numbers from 1 to 50 except those divisible by 3
		
		//print numbers from 1 to 50 except those divisible by 3
		
				for(int i=3; i<=50; i+=3) {
					System.out.print(i+" ");
							
				}
				
				//Create a program that will keep asking user to apply for a credit card.
				//As soon you get “yes” from a user program should stop asking.
				Scanner input=new Scanner(System.in);
				String CC;
				
				do {
					System.out.println("Do you want to apply to a credit card");
				CC=input.nextLine();
				}while(!CC.equalsIgnoreCase("yes"));
					System.out.println("Here is your credit card");
	}
}
