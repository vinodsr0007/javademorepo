package com.java;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
    String name= "vinod ronad is nice person" ;
    System.out.println(Arrays.toString(name.toCharArray()));
    System.out.println("   v i n o d   ".strip());  // it strips initial and last white spaces
	//System.out.println(Arrays.toString(name.split(regex:" ")));
	System.out.println(name.indexOf('p'));
	System.out.println(name.toUpperCase());
	}

}
