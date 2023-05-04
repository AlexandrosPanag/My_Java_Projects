import javax.swing.*;

public class Main {
    public static void main(String[] args) {
   int myage;
   myage=Integer.parseInt(
   JOptionPane.showInputDialog("Please give your age"));
   System.out.println("Your age is:"+myage);
   //Alternative version
   //JOptionPane.showMessageDialog(null,"Your age is:"+myage);
   }
    
}