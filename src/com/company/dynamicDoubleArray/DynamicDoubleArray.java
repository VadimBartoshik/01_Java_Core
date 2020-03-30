package com.company.dynamicDoubleArray;

import java.util.Arrays;

public class DynamicDoubleArray {
    private static double array[];

    public DynamicDoubleArray() {
    }


    public DynamicDoubleArray(int length) {
        array = new double[length];
    }

    public double[] addElement(double element) {
        if (isZeroLength()) {
            return array = addElementInEmptyArray(element);
        } else {
            return array = addElementInFilledArray(element);
        }
    }

    public double getElement(int index) throws IndexOutOfBoundsException {
        if (isIndexIncludeInArray(index)) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException(" index '" + index + "' is located outside the array boundary");
        }
    }

    public double[] removeElement(int index) throws IndexOutOfBoundsException {
        if (isZeroLength() || !isIndexIncludeInArray(index)) {
            throw new IndexOutOfBoundsException(" index '" + index + "' is located outside the array boundary");
        }
        return array = overwriteDeletedElement(index);
    }

    public double[] overwriteDeletedElement(int index) {
        double[] newArray = new double[array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            }
            else{
                newArray[i]=array[i+1];
            }
        }
        return newArray;
    }

    public boolean isIndexIncludeInArray(int index) {
        if (index < array.length && index > -1) {
            return true;
        }
        return false;
    }

    public boolean isZeroLength() {
        if (array == null) {
            return true;
        }
        return false;
    }

    public double[] addElementInEmptyArray(double element) {
        double[] newArray = {element};
        return newArray;
    }

    public double[] addElementInFilledArray(double element) {
        double[] newArray = overwriteAddedElement();
        newArray[newArray.length - 1] = element;
        return newArray;
    }


    public double[] overwriteAddedElement() {
        double[] newArray = new double[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }


    @Override
    public String toString() {
        return "DynamicDoubleArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }


}
