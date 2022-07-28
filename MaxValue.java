package com.Generics;

public class MaxValue<K extends Comparable<K>> {

    K var1,var2,var3;

    public MaxValue(K var1, K var2, K var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }


    public void testMaximum(){
        testMaximum(var1,var2,var3);
    }

    static <T extends Comparable<T>> void testMaximum(T val1,T val2,T val3){
        if((val1.compareTo(val2))>=0 && (val1.compareTo(val3))>=0)
            System.out.println(val1+ " is the largest");
        else if ((val2.compareTo(val1))>=0 && (val2.compareTo(val3))>=0) {
            System.out.println(val2+" is the largest");
        }
        else{
            System.out.println(val3+" is the largest");
        }
    }
}