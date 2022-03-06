package com.java;


public class PatternCODE {

	public static void main(String[] args) {
		pattern3(4);
		
	}
		
   //when column are in incremental order
	/*	 int n=4;
		 
		 for(int row=1; row<=n; row++) {
				for(int col=1; col<=row; col++) {
					System.out.print("* ");
				}
				System.out.println();
			}*/
	
	// when column are in decremental order
	/* static void pattern3(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}*/
	
	static void pattern3(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}

		
	}
	
	