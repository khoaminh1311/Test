//Remove an Element from ArrayList

//Create an ArrayList containing integers from 1 to 10. 
//Remove the number 5 from the list and print the list after removal.
package test.ARRAY_LIST;

import java.util.ArrayList;

public class REMOVE_ELEMENT {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        for(int i = 1; i <=10; i++) {
            number.add(i);
        }
       number.remove(Integer.valueOf(5));     
           System.out.println("List number after removing number 5 " + number);
    }
}