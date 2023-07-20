package javaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentFrame extends JFrame
{
    private ArrayList<Student> mstudents=new ArrayList<Student>();
    private JButton addButton,showButton,saveButton,loadButton,removeButton;
    private JTextArea showArea;
    public String removal;
    int temp=0;
    
    //Προσθέτοντας Φοιτητή
    void addStudent()
    {
       mstudents.add(new Student()); 
    }
    
    //Εμφανίζοντας Μαθητή
    void showStudent()
    {
        
        String text="";
        for(Student x :mstudents)
        {
            text+=x+"\n";
        }
        showArea.setText(text);
    }
    
    //Αποθυκεύοντας Μαθητή
    void saveStudent()
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
              for(Student x:mstudents)
              {
                  pw.println(""+x);
              }
              fw.close();
          } catch (IOException ex) {
              Logger.getLogger(StudentFrame.class.getName()).log(Level.SEVERE, null, ex);
          } 
          
      }
    }
    
    //Φορτώνοντας Μαθητή
    void loadStudent()
    {
        JFileChooser chooser=new JFileChooser();
      int returnVal = chooser.showOpenDialog(this);
      if (returnVal == JFileChooser.APPROVE_OPTION) 
      {
          
          try {
              String filename=chooser.getSelectedFile().getAbsolutePath();
              FileReader rw=new FileReader(filename);
              Scanner in=new Scanner(rw);
              mstudents=new ArrayList<Student>();
              while(in.hasNextLine())
              {
                  String line=in.nextLine();
                  String[] parts=line.split(",");
                  mstudents.add(new Student(parts[0],parts[1],parts[2],Integer.parseInt(parts[3])));
                  
              }
          } catch (IOException ex) 
          {
              
          } 
          
      }
    }
    //Διαγράφωντας Μαθητή
    void removeStudent(){
       removal = JOptionPane.showInputDialog("Παρακαλώ δώστε ΑΜ μαθήματή");        
        //οσο ο μαθητής υπάρχει
        boolean found =true;
        while(found)
        {
            found=false;
            for(int i=0;i<mstudents.size();i++)
            {
                if(temp==0){
                if(mstudents.get(i).getam().equals(removal))
                {
                    mstudents.remove(i);
                    found=true;
                    temp=1;
                    break;
                }
            }
            }
        }
       //Συνθήκη βρέθηκε τελεστής temp=1 αληθές , 0=ψευδές 
        if(temp==0){
           JOptionPane.showMessageDialog(null,"Ο Αριθμός Μητρώου δεν βρέθηκε!");
        }
        else if(temp==1){
            JOptionPane.showMessageDialog(null,"Βρέθηκε ο αριθμός μητρώου, παρακαλώ πατήστε 'Εμφάνιση' ");
            temp=0;
        }
   }

    //Φτιάχνοντας τα κουμπιά
    void makeButtons()
    {
        JPanel buttonPanel=new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2));
        addButton=new JButton("Νεος Μαθητής");
        addButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                    addStudent();
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
                showStudent();
            }
            
        });
        saveButton=new JButton("Αποθύκευση");
        buttonPanel.add(saveButton);
        saveButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                saveStudent();
            }
            
        });
        loadButton=new JButton("Φόρτωση");
        buttonPanel.add(loadButton);
        loadButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                loadStudent();
            }
            
        });
        removeButton = new JButton("Διαγραφή Μαθητή");
        buttonPanel.add(removeButton);
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                removeStudent();
            }

        });
        add(buttonPanel);
    }
    
    //Φτιάχνοντας το StudentFrame
    public StudentFrame(String title)
    {
        super(title);
        setSize(750,300);
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