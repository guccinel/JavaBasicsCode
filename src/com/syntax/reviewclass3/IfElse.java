package com.syntax.reviewclass3;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String user="Nel";
		String password="pass123";
		// whenever we use primitive data types like byte short int long float double char boolean
		// we use ==
		// whenever we use non primitive data types we user .equals method
		if(user.equals("Nel") && password.equals("pass123")) {
			System.out.println("Welcome back to Syntax");
			
		}else {
			System.out.println("username or password is not correct");
		}
		// when debugging make sure
		// you have not disabled the breakpoint
		//you have not enabled the skip all breakpoints option in debug window
		
		
	}
}

			
	
			
		
	