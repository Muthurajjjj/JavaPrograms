package org.programs;

public class EvenNumber {

	public static void main(String[] args) {
		int c=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0)
				c++;
		}
		System.out.println(c);
	}

}
