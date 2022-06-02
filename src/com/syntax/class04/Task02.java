package com.syntax.class04;

public class Task02 {

	public static void main(String[] args) {
		// Write a program to store a value whether user has diploma or not.
		// If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. 
		// Then if user has a degree program should check a gpa score. 
		// If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”, 
		// otherwise → “You should have studied harder” .
		
		boolean diploma=true;
		double gpa=4.0;	
		if (diploma) {
			System.out.println("Congratulations");
			if (gpa>3.5) {
				System.out.println("You are eligble for scholarship");
			}else if (gpa <3.4) {
				System.out.println("You should have studied harder");
			}
			
			System.out.println("-----------");
			
			double rate, price;
			rate=5.2;
			price=35216;
			if (rate>4.5) {
				System.out.println("House would not be bought");
			}else if(price>50000) {
				System.out.println("Loan will be taken from bank");
				if (price<49000) {
					System.out.println("Cash will be paid");
				}
			}
			
			
			
		}

	}

}
