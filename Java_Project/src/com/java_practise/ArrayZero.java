package com.java_practise;

public class ArrayZero {

	public static void main(String[] args) {
		int a[]= {0,1,0,2,0,3,0,4,0,5,0,6};
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			
				if(a[i]==0) {
					b[i]=a[i];
					System.out.print(a[i]);
					
				}
				
				else {
					c[i]=a[i];
					
				}
			
		}

		System.out.println();
		for(int k=0;k<c.length;k++) {
			if(c[k]!=0)
			System.out.print(c[k]);
		}
		
		
}
}






//package com.java_practise;
//
//public class Arrays {
//	
//	public static void main(String[] args) {
//		
////		1
////		1 2
////		1 2 3
////		1 2 3 4
//		
////		for(int i=1;i<5;i++) {
////			for(int j=1;j<i+1;j++) {
////				System.out.print(j);
////			}
////			System.out.println();
////		}
//		
////		1
////		2 3
////		4 5 6
////		7 8 9 10
//		int num=1;
//		for(int i=1;i<6;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(num+" ");
//				num++;
//			}
//			System.out.println();
//		}
//		
//	}
//	
//
//}
