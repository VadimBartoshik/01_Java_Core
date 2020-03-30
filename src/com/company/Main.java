package com.company;

import com.company.dynamicDoubleArray.DynamicDoubleArray;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DynamicDoubleArray array= new DynamicDoubleArray();
        array.addElement(5.6);
        array.addElement(1.8);
        array.addElement(2.2);
        try {
           array.removeElement(2);
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println( array.toString());
    }
}
