/*
 Search for an Element in ArrayList

Create an ArrayList with keywords like "Java", "Python", "C++", "JavaScript". 
Check if "Python" is in the list and print the result.
 */
package test.ARRAY_LIST;

import java.util.ArrayList;

public class SEARCH_ELEMENT {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>();
        elements.add("Java");
        elements.add("Python");
        elements.add("C++");
        elements.add("JavaScript");
        int count = 0;
        for(int i = 0; i < elements.size(); i++) {
            if(elements.get(i) == "Python") {
                count++;
            }
        }
        if(count == 1) {
            System.out.println("Python in the list");
        } else {
            System.out.println("Python not in the list");
        }
    }
}
