package com.syntax.class05;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter 3 distinct numbers");
	    int num1=10; 
	    int num2=30; 
	    int num3=45; 
	    if(num1>num2){
	      if(num1>num3){
	        System.out.println("The largest number is " + num1);
	      }
	    }else if(num2>num3){
	      if(num2>num1){
	        System.out.println("The largest number is " + num2);
	      }
	    }else if(num3>num2){
	      if(num3>num1){
	         if(num2>num1){
	        System.out.println("The largest number is " + num3);
	        }
	      }
	    }
	}
}
	


	


