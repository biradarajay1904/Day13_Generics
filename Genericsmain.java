package com.Generics;


public class Genericsmain {
	
	    public static void main(String[] args) {
	     System.out.println("welcome to generics program");
	     MaxValue<Integer> maxValue = new MaxValue<>(5,4,3);
	        maxValue.testMaximum();
	        MaxValue<Float> maxValue1 = new MaxValue<>(5.2F,8.3F,3.2F);
	        maxValue1.testMaximum();
	        MaxValue<String> maxValue2 = new MaxValue<>("Peach","Apple","Zach");
	        maxValue2.testMaximum();
	    }
	}


