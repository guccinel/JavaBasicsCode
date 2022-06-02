package com.syntax.class03;

public class DoubleComparison {

	public static void main(String[] arg) {
		// Create a Java program and name it Double Comparison.
		// Declare 2 double values and if value of first variable is higher then the
		// second,
		// print “Double value __ is larger than __ .” Otherwise print
		/*
		 * when your code has no errors always try to format it windows ctr+shift+f
		 */

		double a = 4.99;
		double b = 2.99;

		if (a > b) {
			System.out.println("double value " + a + " is larger than " + b);
		}

		int temp = 19;
		if (temp < 32) {
			System.out.println("water will freeze with temperature " + temp);
			System.out.println("It is cold outside");
			System.out.println("Make sure to use a jacket and a scarf");

		} else {
			System.out.println("water will NOT freeze with temperature " + temp);
			System.out.println("It is not that cold outside then");
		}
		System.out.println("Continues code");
		System.out.println("I am code outside of IF block");
	}
}
