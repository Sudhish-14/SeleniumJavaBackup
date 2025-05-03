package com.java_practise;

public class ArrayLastZero {
	
	public static int firstmostzero(int arr[]) {
		 int count=0;
		 for (int i=arr.length-1;i>=0;i--) {
			 
			  if(arr[i]==0) {
				count++;
				
			 }
			 else {
				 break;
			 }
//				countA++;
		 }
		 return count;
//		 System.out.println(count);
		
	}
 public static void main(String[] args) {
	 int a[]= {1,3,0,4,9,0,0,0};
	 int b[] ={2,4,6,7,0,9,0,0};
	 int c[]= {3,5,0,8,5,9,0};
	 
	 System.out.println("A array contains "+firstmostzero(a)+" Zeros");
	 System.out.println("B array contains "+firstmostzero(b)+" Zeros");
	 System.out.println("C array contains "+firstmostzero(c)+" Zeros");
	 
	
	 }
}

