package com.Generics;


public class Genericsmain {
	
	    public static void main(String[] args) {
	     System.out.println("welcome to generics program");
	     Integer[] intArray = {5,7,6,8};
	        Float[] floatArray = {5.3F,9.2F,3.4F,8.6F};
	        String[] stringArray = {"vipul","ajay","sam","anusha"};
	        MaxValue<Integer> maxValue = new MaxValue<>(intArray);
	        maxValue.testMaximum();
	        MaxValue<Float> maxValue1 = new MaxValue<>(floatArray);
	        maxValue1.testMaximum();
	        MaxValue<String> maxValue2 = new MaxValue<>(stringArray);
	        maxValue2.testMaximum();
	    }
	}


