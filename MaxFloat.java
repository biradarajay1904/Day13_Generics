package com.Generics;


public class MaxFloat {
    void maxvalue(Float val1,Float val2,Float val3){
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
