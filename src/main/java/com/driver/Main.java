package com.driver;

public class Main {
   public static void main(String[] args) {
        // Task 3: Create an object of RWOnly class
        RWOnly obj = new RWOnly();

        // Task 4: Try accessing the private variable directly
        // Uncomment the line below and you will see an error
        // obj.name = "John"; // Error: name has private access in RWOnly
        
        // Uncomment the line below to see the error when trying to access the variable directly
        // System.out.println(obj.name); // Error: name has private access in RWOnly

        // Task 6: Use setter and getter methods
        obj.setName("John");
        System.out.println(obj.getName()); // Prints: John
    }
}
