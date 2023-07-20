package javaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LessonFrame extends JFrame
{
    //Μέρος δηλώσεων
    private ArrayList<Lesson> mlessons=new ArrayList<Lesson>();
    private ArrayList<Lesson> showup=new ArrayList<Lesson>();
    private JButton addButton,showButton,saveButton,loadButton,removeButton,choosemesterButton;
    private JTextArea showArea;
    public String removal,givesemester;
    int temp=0;
    
    //Προσθέτουμε το μάθημα
    void addLesson()
    {
        mlessons.add(new Lesson());   
    }
    
 
    //Δημιουργία εμφάνισης μαθήματος
    void showLessons()
    {
        String text="";
        for(Lesson x :mlessons)
        {
            text+=x+"\n";
        }
        showArea.setText(text);
    }
    //Αποθυκέυοντας τα μαθήματα
    void saveLessons()
    {
      JFileChooser chooser=new JFileChooser();
      int returnVal = chooser.showSaveDialog(this);
      if (returnVal == JFileChooser.APPROVE_OPTION) 
      {
          
          try {
              String filename=chooser.getSelectedFile().getAbsolutePath();
              FileWriter fw=null;
              fw = new FileWriter(filename);
              PrintWriter pw=new PrintWriter(fw);
              for(Lesson x:mlessons)
              {
                  pw.println(""+x);
              }
              fw.close();
          } catch (IOException ex) {
              Logger.getLogger(StudentFrame.class.getName()).log(Level.SEVERE, null, ex);
          } 
          
      }
    }
    //Φορτώνοντας τα μαθήματα
    void loadLessons()
    {
        JFileChooser chooser=new JFileChooser();
      int returnVal = chooser.showOpenDialog(this);
      if (returnVal == JFileChooser.APPROVE_OPTION) 
      {
          
          try {
              String filename=chooser.getSelectedFile().getAbsolutePath();
              FileReader rw=new FileReader(filename);
              Scanner in=new Scanner(rw);
              mlessons=new ArrayList<Lesson>();
              while(in.hasNextLine())
              {
                  String line=in.nextLine();
                  String[] parts=line.split(",");
                  mlessons.add(new Lesson(parts[0],parts[1],parts[2]));
                  
              }
          } catch (IOException ex) 
          {
              
          } 
          
      }
    }
    //Επιλογή Εξαμήνου και εύρεση εξαμήνου
     Lesson findSemester() {
        givesemester = JOptionPane.showInputDialog("Παρακαλώ δώστε κωδικό εξαμήνου");
        for(Lesson x: mlessons) {
        if(x.getsemester().equals(givesemester)) {
            showup.add(x);
        }
    }
    return null;
    }
   
    
    //Διαγράφοντας ένα μάθημα
    void removeLesson(){
       removal = JOptionPane.showInputDialog("Παρακαλώ δώστε κωδικό μαθήματος");        
        //οσο ο μαθητής υπάρχει
        boolean found =true;
        while(found)
        {
            found=false;
            for(int i=0;i<mlessons.size();i++)
            {
                if(temp==0){
                if(mlessons.get(i).getkwdikos().equals(removal))
                {
                    mlessons.remove(i);
                    found=true;
                    temp=1;
                    break;
                }
            }
            }
        }
       //Συνθήκη βρέθηκε τελεστής temp=1 αληθές , 0=ψευδές 
        if(temp==0){
           JOptionPane.showMessageDialog(null,"Ο κωδικός μαθήματος δεν βρέθηκε!");
        }
        else if(temp==1){
            JOptionPane.showMessageDialog(null,"Βρέθηκε ο κωδικός μαθήματος, παρακαλώ πατήστε 'Εμφάνιση' ");
            temp=0;
        }
   }
    //Φτιάχνοντας τα κουμπιά
    void makeButtons()
    {
        //ΚΟΥΜΠΙ ΝΕΟ ΜΑΘΗΜΑ
        JPanel buttonPanel=new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2));
        addButton=new JButton("Νέο Μάθημα");
        addButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                    addLesson();
            } 
        });
        buttonPanel.add(addButton);
        showButton=new JButton("Εμφάνιση");
        buttonPanel.add(showButton);
        showButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                showLessons();
            }
            
        });
        //ΚΟΥΜΠΙ ΑΠΟΘΥΚΕΥΣΗ
        saveButton=new JButton("Αποθύκευση");
        buttonPanel.add(saveButton);
        saveButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                saveLessons();
            }
            
        });
        //ΚΟΥΜΠΙ ΦΟΡΤΩΣΗΣ
        loadButton=new JButton("Φόρτωση");
        buttonPanel.add(loadButton);
        loadButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                loadLessons();
            }            
        });
        //ΚΟΥΜΠΙ ΔΙΑΓΡΑΦΗ ΜΑΘΗΜΑΤΟΣ
        removeButton = new JButton("Διαγραφή Μαθήματος");
        buttonPanel.add(removeButton);
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                removeLesson();
            }

        });
        
    
        //ΚΟΥΜΠΙ ΕΠΙΛΟΓΗΣ ΕΞΑΜΗΝΟΥ
        choosemesterButton = new JButton("Επιλογή Εξάμηνου");
        buttonPanel.add(choosemesterButton);
        choosemesterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                findSemester();
                JOptionPane.showMessageDialog(null,"Βρέθηκαν μαθήματα:"+showup);
                showup.clear();
            }

        });
        add(buttonPanel);
    }
    
    
    //Δημιουργόντας το LessonFrame
    public LessonFrame(String title)
    {
        super(title);
        setSize(850,300);
        setLayout(new GridLayout(3,1));
        setResizable(true);
        makeButtons();
        showArea=new JTextArea("");
        showArea.setRows(5);
        showArea.setColumns(25);
        showArea.setEditable(false);
        JScrollPane sp=new JScrollPane(showArea);
        add(sp);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
