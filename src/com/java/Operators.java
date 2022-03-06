package com.java;

public class Operators {

	public static void main(String[] args) {
      
	/*	System.out.println('a'+'b');  // a as a charactor taking ascii value
		System.out.println("a"+"b");  // a as string here
		System.out.println("a"+1);    // string and integer
		// here integer 1 is converted to tostring
		
		System.out.println((char)('a'+3));  */
		
	/*	String series = " ";
		for(int i=0; i<=26; i++) {
			char chr= (char)('a'+i);
			series= series+chr;
		}
		
		System.out.println(series);*/
		
		StringBuilder builder= new StringBuilder();
		for(int i=0; i<=26; i++) {
			
			char chr= (char)('a'+i);
			builder.append(chr);
		}
		System.out.println(builder);
		
	     builder.reverse();
	     
	    System.out.println(builder);
	}

}
