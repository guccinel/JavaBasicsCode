package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		int height=input.nextInt();
		
		if(height<60) {
			System.out.println("You are short");
		}else if(height>=60&&height<=72) {
			System.out.println("You are medium");
		}else if(height>72) {
			System.out.println("You are tall");
		}
		
		System.out.println("-----------------------");
Scanner scan=new Scanner (System.in);
		
		System.out.println("please enter a number");
		int day = scan.nextInt();
		
		if (day>=1 || day<=5) {
			System.out.println("It is a weekday");
		}else if (day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		
	}
}

