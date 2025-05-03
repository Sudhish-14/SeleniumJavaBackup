package com.java_practise;

public class Anagram {
	
	public static void main(String[] args) {
		
		String a="gjod";
		String b="dog";
		
		char arr1[]=a.toCharArray();
		char arr2[]=b.toCharArray();
//		char arr3[]=new char[arr1.length];
		String c="";
		String d="";
		 for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
			 if(arr2[j]==arr1[i]) {
				c+=arr2[j];
				d+=arr1[i];
			 }
			 
			}
			 
				 System.out.println("its not Anagram");
				 break;
			 
			
		}
		 System.out.println(c);
		 System.out.println(d);
		if(c.equals(d)) {
			System.out.println("its Anagram");
		}
		else {
			System.out.println("its not an  Anagram");
		}
	}

}
