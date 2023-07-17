// By Alexandros panagiotakopoulos - alexandrospanag.github.io

import javax.swing.*;

public class exampleproject {

    public static void main(String[] args) {
   String firstname,secondname;

      // Get the user's name.
      firstname = JOptionPane.showInputDialog("Please give the first username? "); //take the first user input
      secondname = JOptionPane.showInputDialog("Please give the second username? "); //take the second user input
      // Display message
      JOptionPane.showMessageDialog(null, "Hello " +firstname+ " and "+ secondname); // print the first message
      JOptionPane.showMessageDialog(null, "Goodbye " +secondname+ " and "+ firstname); // print the first message
    }
}
