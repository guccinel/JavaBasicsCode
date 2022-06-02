package com.syntax.reviewclass3;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// when code executes but does not produce expected results we call these mistakes logical errors
		// when code does not even execute we call these mistakes syntax errors
		
		// in non primitive type variables we can store null which means nothing
		String day="Friday"; // in non-primitive type variables we can store null which means nothing
		if(day.equals("Monday")) {
			System.out.println("weekday");
		}else if("Tuesday".equals(day)) {
			System.out.println("weekday");
		}else if("Wednesday".equals(day)) {
			System.out.println("weekday");
		}
		
		if(day.equals("Monday")) {
			System.out.println("weekday");
		}
		
		if("Tuesday".equals(day)) {
			System.out.println("weekday");
		}
		
		if("Wednesday".equals(day)) {
			System.out.println("weekday");
		}
		// if we have to test multiple conditions we go with if else if conditions
	}
		
}
