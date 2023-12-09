package org.programs;

public class ArmstrongNumber {
	public static void main (String[]args) {
		
		int a=153,n=153;
		int i=0,j=0;
		
		while(a>0) {
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
		}
		System.out.println(j);
		if(j==n) {
			System.out.println("Armstrong");
		}
	}
}
