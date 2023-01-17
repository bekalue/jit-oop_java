//  this a packet use for arraylist 
import java.util.ArrayList;
// Import the LinkedList class
import java.util.LinkedList;
// import the HashMap class
import java.util.HashMap; 
// Import the HashSet class
import java.util.HashSet; 
// import the iterator
import java.util.Iterator;


public class collection<T,K> {
  public static void main(String[] args) {
    ArrayList<String> exampleString = new ArrayList<String>();
    // adding file to arraylist

    exampleString.add("String1");
    exampleString.add("String2");
    exampleString.add("String3");
    exampleString.add("String4");
    System.out.println(exampleString);

    //get a value
    exampleString.get(0);

    exampleString.get(3);

    // linked list
 LinkedList<String> exampleStrings = new LinkedList<String>();
    // adding file to linkedlist

    exampleStrings.add("String1");
    exampleStrings.add("String2");
    exampleStrings.add("String3");
    exampleStrings.add("String4");
    System.out.println(exampleStrings);

    //get a value
    exampleStrings.get(0);

    exampleStrings.get(3);

    //hashmap

        HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);

    //Hash set
        HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
  
  }
}


