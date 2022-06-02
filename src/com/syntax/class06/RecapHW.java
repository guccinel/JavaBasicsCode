package com.syntax.class06;

import java.util.Scanner;

public class RecapHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    boolean checkboxSelected=false;

	 if(!checkboxSelected) {
	 System.out.println("Click on checkbox");
	}
	 
	 System.out.println("---------------------------------------------------------------");
	 
	 Scanner input=new Scanner(System.in);
		System.out.println("Enter number of years");
		int years=input.nextInt();
		System.out.println("Enter annual salary");
		int salary=input.nextInt();
		
		if(years>=5) {
			System.out.println("You are eligible for the bonus");
			if (salary>=50000) {
				System.out.println("You are eligible for 5000 bonus");
			}else {
			System.out.println("You are eligible for 3000 bonus");
			}
		}else {
				System.out.println("Sorry you are not eligible for bonus");
			}
		System.out.println("---------------------------");
		
		System.out.println("Current time");
		int time=input.nextInt();
		if (time>=1 &&time<= 11) {
			System.out.println("Morning");
		}else if (time>=12 && time<=15) {
			System.out.println("Afternoon");
		}else if (time>=16 && time<=20) {
			System.out.println("Evening");
		}else if (time>=21 && time <=24) {
			System.out.println("Night");
		}else {
			System.out.println("Invalid time entered");
		}
		
		System.out.println("-----------------------------------------------------");
		
        Scanner scan=new Scanner (System.in);
		
		System.out.println("please enter your birth month");
		String month=scan.next();
		
		if (month.equalsIgnoreCase("March")|| month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")) {
			System.out.println("You were born in season Spring");
		
		} else if (month.equalsIgnoreCase("June")|| month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")) {
			System.out.println("You were born in season Summer");
		
		} else if (month.equalsIgnoreCase("September")|| month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")) {
			System.out.println("You were born in season Autumn/Fall");
		
		} else if (month.equalsIgnoreCase("December")|| month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")) {
			System.out.println("You were born in season Winter");
		}
		System.out.println("--------------------------------------------------");
		
		System.out.println("Enter the score you get in quiz");
		int quiz=input.nextInt();
		System.out.println("Enter the score you get in midterm");
		int mid=input.nextInt();
		System.out.println("Enter the score you get in final");
		int fin=input.nextInt();
		int averageS= (quiz+mid+fin)/3;
		
		System.out.println("Your average score is "+averageS);
		
		if (averageS>=90) {
			System.out.println("Your grade is A");
		}else if(averageS>=70 && averageS>=90) {
			System.out.println("Your grade is B ");
		}else if(averageS>=50 && averageS<70) {
			System.out.println("Your grade is C");
		}else if(averageS<50) {
			System.out.println("Your grade is F");
		}
		
		
		/*
		 * if you are A or B student --> you are doing great
		 * otherwise --> please try to study more
		 *  
		 */
	}
}
