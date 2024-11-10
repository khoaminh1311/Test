/*
Sort ArrayList

Create an ArrayList containing integers (5, 3, 8, 2, 4). 
Sort the list in ascending order and print the result.
 */
package test.ARRAY_LIST;

import java.util.ArrayList;
import java.util.Arrays;

public class SORT_ELEMENT {
    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 2, 4));
        for(int i = 0; i<numbers.size();i++) {
            for(int j = i+1; j<numbers.size();j++) {
                if(numbers.get(i) > numbers.get(j)) {
                    int temp = numbers.get(i);
                    numbers.set(i,numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }
        for(Integer number:numbers) {
     System.out.println(number);
 }
    }
}
