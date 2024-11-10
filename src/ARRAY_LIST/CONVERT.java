/*
 Convert ArrayList to Array

Create an ArrayList with 5 integers. 
Convert this ArrayList to an array and print each element of the array.
 */
package test.ARRAY_LIST;

import java.util.ArrayList;
import java.util.Arrays;

public class CONVERT {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4,21,5,6,9));
        Integer[] numberArray = new Integer[numbers.size()];
        numberArray = numbers.toArray(numberArray);
        System.out.println("Array elements:");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
    }
    }
