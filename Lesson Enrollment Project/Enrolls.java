package javaproject;
import javax.swing.*;

public class Enrolls 
{
    private String am,kwdikos;
            private Double grade;
    public Enrolls()
    {
        am=JOptionPane.showInputDialog("Εισαγωγή ΑΜ φοιτητή: ");
        kwdikos=JOptionPane.showInputDialog("Εισαγωγή κωδικού μαθήματος: ");
        grade=Double.parseDouble(JOptionPane.showInputDialog("Εισαγωγή βαθμού με πραγματικό (ή ακέραιο) αριθμό: "));
    }
    public Enrolls(String a,String b, Double c)
    {
        am=a;
        kwdikos=b;
        grade=c;
        
    }
    public Double getgrade(){
        return grade;
  }
    public void setgrade(Double x){
       grade=x;
    }
    
  public void setam(String a) {
    am = a;
  }

  public String getam() {
    return am;
  }
  public void setkwdikos(String a) {
    kwdikos = a;
  }

  public String getkwdikos() {
    return kwdikos;
  }
  
    public String toString()
    {
        return am+","+kwdikos+","+grade;
        
    }
}
