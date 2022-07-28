package com.Generics;


public class MaxInteger {
	
	    void maxvalue(Integer val1,Integer val2,Integer val3){
	        if((val1.compareTo(val2))>=0 && (val1.compareTo(val3))>=0)
	            System.out.println(val1+ " is the largest");
	        else if ((val2.compareTo(val1))>=0 && (val2.compareTo(val3))>=0) {
	            System.out.println(val2+" is largest");
	        }
	        else{
	            System.out.println(val3+" is largest");
	        }
	    }

}
