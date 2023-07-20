package javaproject;

/**
 *
 * @author alexandros_panagiotakopoulos AM16108/1716
 */
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;


class JMenuBarTest extends JFrame implements ActionListener{
    private JMenuItem   Exit;
    private JMenuItem   New;
    private JMenuItem   Declare;
    private JMenuItem   NewLess;
    private JButton bt;
  
    JMenuBarTest()
    {
        setTitle("Project AM1716/16108");
        setLayout(new FlowLayout());
        setJMenuBarAndMenuBarItems();
        setAction();
        setSize(350, 350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  
    void setJMenuBarAndMenuBarItems()
    {
        JMenuBar menuBar = new JMenuBar();
        //Μενου Αρχείο
        JMenu menu1    = new JMenu("Αρχείο");
        Exit     = new JMenuItem("Έξοδος");
        menu1.add(Exit);
        //Μενού Μαθητής
        JMenu menu2    = new JMenu("Μαθητής");
        New      = new JMenuItem("Νεός Μαθητής");
        Declare  = new JMenuItem("Δήλωση Μαθήματος");
        menu2.add(New);
        menu2.addSeparator();
        menu2.add(Declare);
        //Μενού Μάθημα
        JMenu menu3    = new JMenu("Μαθήμα");
        NewLess       = new JMenuItem("Νέο Μάθημα");
        menu3.add(NewLess);
        //Πρόσθαιση επιλεγών στο σύνολο μας!
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        setJMenuBar(menuBar);
    }
 
    //Δίνοντας Action
    void setAction()
    {
        Exit.addActionListener(this);
        Declare.addActionListener(this);
        New.addActionListener(this);
        NewLess.addActionListener(this);
      
    }
     
    public void actionPerformed(ActionEvent eve)
    {
        //Δημιουργία Επιλογών Αρχείου
       if(eve.getSource() == Exit)
            System.exit(0);       
        //Δημιουργία Μαθητης Μενου
        //Δημιουργία Μάθητης > Νέο Μάθητης
        else if(eve.getSource() == New){ 
            StudentFrame f=new StudentFrame("");
        }
        //Δημιουργία Μάθητης >Δήλωση Μαθήματος
        else if (eve.getSource()==Declare){
            EnrollFrame o=new EnrollFrame("");
        }
        //******************************************************************************//
         //Δημιουργία Επιλογών Μάθημα        
         //Δημιουργία Επιλογής Μάθημα > Νέο Μάθημα
        else if(eve.getSource() == NewLess){
               LessonFrame y=new LessonFrame("");
        }
       
    }
}

public class Main {
  
    public static void main(String[] args) {
        JMenuBarTest jm = new JMenuBarTest();
    }
}
