//Traverse the ArrayList

//Create an ArrayList containing the names of 5 cities. Traverse the list and print each city name.
package test.ARRAY_LIST;

import java.util.ArrayList;

public class TRAVERSE_LIST {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Hanoi");
        cities.add("Ho Chi Minh City");
        cities.add("Da Nang");
        cities.add("Hue");
        cities.add("Nha Trang");
        for (String city : cities) {
            System.out.println(city);
        }
    }
    }
