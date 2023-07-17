// By Alexandros panagiotakopoulos - alexandrospanag.github.io

import javax.swing.*;

public class exampleproject {

 public static void main(String[] args) {
   String age;

      // Get the user's name.
      age = JOptionPane.showInputDialog("What is your age? ");

      // Display message
      JOptionPane.showMessageDialog(null, "You are " +age+ " years old");
    }
}
