package com.java;

public class Stringtype {

	public static void main(String[] args) {
		
     String name1= new String("vinod");
     String name2= new String("vinod");
     
     System.out.println(name1==name2);
     System.out.println(name1.equals(name2));
     
     System.out.println(name1.charAt(0));
     System.out.println(name1.indexOf('d'));
     
	}

}
