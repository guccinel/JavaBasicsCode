package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//You are DMV representative and you need to ask customer their age. 
		//If they are 18 and older you will issue a driver license to them, 
		//otherwise you will offer them to get a learners permit.

		Scanner input = new Scanner(System.in);	//Create a Scanner object
		
		System.out.println("Please enter your age");
		int age = input.nextInt();  // capture int
		System.out.println(age);
		if (age >= 18) {
			System.out.println("We will issue you a drivers license");
		} else {
			System.out.println("We will provide you with a learners permit");
		}
	}
}
