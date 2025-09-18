package gendric;
import java.util.ArrayList;
import java.util.List;

public class Wildcards {

        public void get(List<? extends Number> list){
            System.out.println("List size: " + list.size());
            // You can read from the list
            for (Number n : list) {
                System.out.println(n);
            }
            // You cannot add to the list because the specific type is unknown
            //list.add(10); // This would cause a compile error
        }

        public static void main(String[] args) {
            // Create an ArrayList of Integers
            List<Integer> intList = new ArrayList<>();
            intList.add(1);
            intList.add(2);
            intList.add(3);

            // Create an ArrayList of Doubles
            List<Double> doubleList = new ArrayList<>();
            doubleList.add(1.1);
            doubleList.add(2.2);
            doubleList.add(3.3);

            Wildcards myObject = new Wildcards();

            // Call the get method with the list of Integers
            System.out.println("Calling with Integer list:");
            myObject.get(intList);
            System.out.println(); // Add a blank line for readability

            // Call the get method with the list of Doubles
            System.out.println("Calling with Double list:");
            myObject.get(doubleList);

    }
}
