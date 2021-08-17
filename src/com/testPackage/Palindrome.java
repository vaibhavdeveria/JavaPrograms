package com.testPackage;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "madam";
		String rev = "";
		String actual_str = str;
		int len = str.length();
		System.out.println(len);
		for (int i = len-1; i>=0; i--) { //4 ,3,2,1,0..
			
			rev = rev+str.charAt(i);
			
			
			
		}
		
		System.out.println(rev);
		if(rev.equals(actual_str)) {
			System.out.println("String is palindrome :" +rev);
		
		}
		else {
			System.out.println("String is not palindrome :" +rev );
		}

	}

}
