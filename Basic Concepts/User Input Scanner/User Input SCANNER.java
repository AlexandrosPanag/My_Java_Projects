// By Alexandros panagiotakopoulos - alexandrospanag.github.io

import java.util.Scanner;

public class HelloGoodbye{

    public static void main(String[] args) {

      // Get the user's name.
      Scanner firstname = new Scanner(System.in);  // Create a Scanner object
      Scanner secondname = new Scanner(System.in);  // Create a Scanner object
      // Display message
      System.out.println( "Hello " +firstname+ " and "+ secondname); // print the first message
      System.out.println( "Goodbye " +secondname+ " and "+ firstname); // print the first message
    }
}