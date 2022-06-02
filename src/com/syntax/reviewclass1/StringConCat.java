package com.syntax.reviewclass1;

public class StringConCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName="Nel";
		String lastName="Guev";
		String fullName=firstName+lastName;
		int num=10;
		int num2=10;
		System.out.println(fullName);
		System.out.println(firstName+num);
		System.out.println(firstName+num+num2);//1st operation=firstName+num=->Ali10+10=->Ali1010
		System.out.println(firstName+(num+num2));//1st operation=(num+num2)=->10+10=>Nel+20=->Nel20
		System.out.println(num+firstName+num2);//10+
		
				

	}

}
