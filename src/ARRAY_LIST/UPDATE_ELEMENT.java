/*
 Update an Element in ArrayList

Create an ArrayList containing integers from 1 to 5. Update the 3rd element to 100 and print the list.
 */
package test.ARRAY_LIST;

import java.util.ArrayList;

public class UPDATE_ELEMENT {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<5;i++) {
            numbers.add(i+1);
        }
 numbers.set(2, 100);
 for(Integer number:numbers) {
     System.out.println(number);
 }
}
}
