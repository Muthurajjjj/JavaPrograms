package org.programs;

public class PalindromeReverseString {

	public static void main(String[] args) {
		String s="madam";
		String r="";
		
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			r=r+ch;
		}
			System.out.println(r);
	if(r.equals(s)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("non palindrome");
	}
	}

}
