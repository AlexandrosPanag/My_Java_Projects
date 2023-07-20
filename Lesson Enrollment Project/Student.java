package javaproject;
import javax.swing.*;

public class Student 
{
    private String am,name,lastname;
    private int semester;
    public Student()
    {
        am=JOptionPane.showInputDialog("Εισαγωγή Αριθμού Μητρώου: ");
        name=JOptionPane.showInputDialog("Εισαγωγή ονόματος: ");
        lastname=JOptionPane.showInputDialog("Εισαγωγή Επίθετου: ");
        semester=Integer.parseInt(JOptionPane.showInputDialog("Εισαγωγή εξάμηνου με ακέραιο αριθμό: "));
    }
    public Student(String a,String b,String c,int d)
    {
        am=a;
        name=b;
        lastname=c;
        semester=d;
        
    }
  public void setam(String a) {
    am = a;
  }

  public String getam() {
    return am;
  }
    public String toString()
    {
        return am+","+name+","+lastname+","+semester;
        
    }
}