package com.Generics;

public class MaxValue<K extends Comparable<K>> {

	  K[] arrayList;

	    public MaxValue(K[] arrayList) {
	        this.arrayList = arrayList;
	    }


	    public void testMaximum(){
	        testMaximum(arrayList);
	    }

	    static <T extends Comparable<T>> void testMaximum(T[] array ){
	        T max = array[0];
	        for (T var:array) {
	            if(var.compareTo(max)>0){
	                max = var;
	            }
	        }
	        System.out.println(max);
	    }
	}