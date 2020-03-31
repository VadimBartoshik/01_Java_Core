package com.company.dynamicDoubleArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DynamicDoubleArray <T> {
    private T array[];

    public DynamicDoubleArray() {
    }


    public DynamicDoubleArray(int length) {
        this.array = (T[]) new Object[length];
    }

    public T[] addElement(T element) {
        if (isZeroLength()) {
            return this.array = addElementInEmptyArray(element);
        } else {
            return this.array = addElementInFilledArray(element);
        }
    }

    public T getElement(int index) throws IndexOutOfBoundsException {
        if (isIndexIncludeInArray(index)) {
            return this.array[index];
        } else {
            throw new IndexOutOfBoundsException(" index '" + index + "' is located outside the array boundary");
        }
    }

    public T[] removeElement(int index) throws IndexOutOfBoundsException {
        if (isZeroLength() || !isIndexIncludeInArray(index)) {
            throw new IndexOutOfBoundsException(" index '" + index + "' is located outside the array boundary");
        }
        return this.array = overwriteDeletedElement(index);
    }

    public T[] overwriteDeletedElement(int index) {
       T[] newArray =(T[]) new Object[this.array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = this.array[i];
            }
            else{
                newArray[i]=this.array[i+1];
            }
        }
        return newArray;
    }

    public boolean isIndexIncludeInArray(int index) {
        if (index < this.array.length && index > -1) {
            return true;
        }
        return false;
    }

    public boolean isZeroLength() {
        if (this.array == null) {
            return true;
        }
        return false;
    }

    public T[] addElementInEmptyArray(T element) {
        T[] newArray = (T[]) new Object[1];
        newArray[0]=element;
        return newArray;
    }

    public T[] addElementInFilledArray(T element) {
        T[] newArray = overwriteAddedElement();
        newArray[newArray.length - 1] = element;
        return newArray;
    }


    public T[] overwriteAddedElement() {
        T[] newArray = (T[]) new Object[this.array.length + 1];
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }
        return newArray;
    }


    @Override
    public String toString() {
        return "DynamicDoubleArray{" +
                "array=" + Arrays.toString(this.array) +
                '}';
    }


}
