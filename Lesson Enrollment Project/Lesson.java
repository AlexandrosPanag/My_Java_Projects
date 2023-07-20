// Δημιουργώντας κατηγορία Lesson
package javaproject;
import javax.swing.*;

public class Lesson 
{
    private String lessoname,kwdikos,semester;
    
    public Lesson()
    {
        lessoname=JOptionPane.showInputDialog("Εισαγωγή ονόματος μαθήματος: ");
        kwdikos=JOptionPane.showInputDialog("Εισαγωγή κωδικού μαθήματος: ");
        semester=JOptionPane.showInputDialog("Εισαγωγή εξαμήνου: ");
    }
    public Lesson(String a,String b,String c)
    {
        lessoname=a;
        kwdikos=b;
        semester=c;
        
    }
   
    public void setam(String a) {
    
        kwdikos = a;
    }

  public String getkwdikos() {
    
      return kwdikos;
  }
    public void setsemester(String a) {
    
        semester = a;
    }
  public String getsemester() {
      return semester;
  }
    public String toString()
    {
        return lessoname+","+kwdikos+","+semester;
        
    }
}