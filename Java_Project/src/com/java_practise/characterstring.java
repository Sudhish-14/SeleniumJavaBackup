package com.java_practise;

public class characterstring {
	public static void main(String[] args) {
		String s ="abcd12345";
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(Character.isDigit(a[i])) {
				System.out.print(a[i]);
			}
			
		}
		System.out.println();
				
	
	for(int i=0;i<a.length;i++) {
		if(Character.isLetter(a[i])) {
			System.out.print(a[i]);
		}
	}
	}
}

