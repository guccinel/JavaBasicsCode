package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name="Oleg ";
		
		String lastName="Smith";
				
		long phone=1234567890;
		
		//xxx - xxx - xxxx
		
		String phoneNumber="123-456-7890";
		String address="123 Washington Str";
		
		int age =30;
		String city="Miami";
		//shortcut for printing
		// type syso +ctrl +space --> hit enter
		System.out.println();// Oleg Smith
		
		System.out.println(name+ lastName);// Oleg Smith
		
		/* when we want to attach String to String 
		 * we can use + 
		 */
		// Oleg lives in Miami
		System.out.println(name+"lives in "+city);
		// Oleg is 30 years old
		System.out.println(name+"is"+age+" years old ");
		
		
		

		
	}

}
