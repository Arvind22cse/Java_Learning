package Recursion;

public class Reverse_a_String {
    public static void main(String[] args) {
        reverseString("Arvi");
    }
    static void reverseString(String str) {
        if (str.isEmpty()) return;  // Base case
        reverseString(str.substring(1)); // recursive call
        System.out.print(str.charAt(0)); // print character after recursion
    }

}
