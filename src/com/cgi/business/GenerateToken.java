package com.cgi.business;

import java.util.Random;

public class GenerateToken {

	 /**
	  * @param args
	  */
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  System.out.println("Generated Token =");
	  System.out.println(gentoken());

	 }

	 private static double gentoken()
	 {
	  return new Random().nextGaussian();
	  
	 }
}
