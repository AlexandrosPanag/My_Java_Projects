// By Alexandros panagiotakopoulos - alexandrospanag.github.io

import javax.swing.*;

public class GuessingWordGame {

    public static void main(String[] args) {
    String secretword,givenword; //word comparison
    int win=0; //win value, 1 if you found the word (won) or 0 if you didn't
    int attempts=0; //player attempts value
    int lives = Integer.parseInt( JOptionPane.showInputDialog("Give the lives that the guesses (INTEGER) player has at his/her disposal before they lose!")); 
    int remaining_attempts=lives;
    
    
    
      // Get the user's name.
         JOptionPane.showMessageDialog(null, "Please give a word"); // print the first messag
      
      secretword = JOptionPane.showInputDialog(""); //take the secret word
      // Display message
      JOptionPane.showMessageDialog(null, "The word is set!"); // print the first message
      
      
      givenword = JOptionPane.showInputDialog(""); //take the first user input
      
      while(attempts<lives){ //while you still have attempts left do ....
      
      if(secretword.equals(givenword) ){ //if the secret word is equal to the given word
        JOptionPane.showMessageDialog(null, "You found the secret word!"); // print the first message
        win=1;
        break;
        }
      
      else
      {
          attempts++; //attempts that you have (counter for the while loop)
          remaining_attempts--; //your remaining attempts are reduced with each wrong attempt
          JOptionPane.showMessageDialog(null,"You guessed the word wrong!"+" You have "+remaining_attempts+" left! Try again!: "); //take another user input
          givenword = JOptionPane.showInputDialog(""); //take another word
        }
      }
      
      JOptionPane.showMessageDialog(null, "Game over!"); // print the game over message
      if(win==1)
        JOptionPane.showMessageDialog(null, "Congratsulations! You won the game! "); // print a win message
      else
          JOptionPane.showMessageDialog(null, "You lost! Better luck next time! "); // otherwise print a losing message
    }   
}