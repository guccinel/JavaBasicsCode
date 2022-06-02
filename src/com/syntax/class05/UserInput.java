package com.syntax.class05;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter name");
		String name=scan.next();
		System.out.println(name);//capture string
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();//capture int
		
		System.out.println("Please enter price");
		double price=scan.nextDouble();//capture double
		
		System.out.println("Please enter boolean");
		boolean boo=scan.nextBoolean();//capture boolean
		
		System.out.println("Please enter any character");
	    char character=scan.next().charAt(0);
		

	}

}
