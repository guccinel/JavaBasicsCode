package com.syntax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		String str="Hello";
		
		//creating a scanner
		Scanner input=new Scanner(System.in);
		
		//send instruction to the console
		System.out.println("Please enter your name");
		
		//we need to grab the values from console
		input.next();// after you type the value -> hit enter
		
		System.out.println("name");
		
		String name="nel";
		//lets send instructions
		System.out.println(name+ "please enter your age");

	}

}
