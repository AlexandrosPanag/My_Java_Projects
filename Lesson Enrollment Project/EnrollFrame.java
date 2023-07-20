//Δημιουργία κατηγορίας Enroll
package javaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EnrollFrame extends JFrame
{
    //Κομμάτι δηλώσεων
    private ArrayList<Enrolls> menrolls=new ArrayList<Enrolls>();
    private ArrayList<Enrolls> showup=new ArrayList<Enrolls>();
    private ArrayList<Enrolls> student=new ArrayList<Enrolls>();
    private JButton addButton,showButton,saveButton,loadButton,removeButton,performanceButton,studentButton;
    private JTextArea showArea;
    public String removal,giveperformance,givenam;
    int temp=0;
    double avg=0;
    
    //Προσθέτοντας Enroll
    void addEnroll()
    {
       menrolls.add(new Enrolls()); 
    }
    //Εμφάνιση μαθητή
    Enrolls findStudent(){
        givenam = JOptionPane.showInputDialog("Παρακαλώ δώστε AM φοιτητή");
        int cnt=0;
        for(Enrolls x: menrolls) {
        if(x.getam().equals(givenam)) {
            student.add(x);
            cnt++;
            avg+=x.getgrade();
        }
    }
    avg=avg/cnt;
    return null;
    }
    
    //Εύρεση επιδόσεων
    Enrolls findPerformances() {
        giveperformance = JOptionPane.showInputDialog("Παρακαλώ δώστε κωδικό μαθήματος");
        for(Enrolls x: menrolls) {
        if(x.getkwdikos().equals(giveperformance)) {
           showup.add(x);
        }
    }
    return null;
    } 
    
    
    //Εμφανίζοντας Enroll
    void showEnroll()
    {
        
        String text="";
        for(Enrolls x :menrolls)
        {
            text+=x+"\n";
        }
        showArea.setText(text);
    }
    
    //Αποθυκεύοντας Enroll
    void saveEnroll()
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
              for(Enrolls x:menrolls)
              {
                  pw.println(""+x);
              }
              fw.close();
          } catch (IOException ex) {
              Logger.getLogger(EnrollFrame.class.getName()).log(Level.SEVERE, null, ex);
          } 
          
      }
    }
    
    //Φορτώνοντας Enroll
    void loadEnrolls()
    {
        JFileChooser chooser=new JFileChooser();
      int returnVal = chooser.showOpenDialog(this);
      if (returnVal == JFileChooser.APPROVE_OPTION) 
      {
          
          try {
              String filename=chooser.getSelectedFile().getAbsolutePath();
              FileReader rw=new FileReader(filename);
              Scanner in=new Scanner(rw);
              menrolls=new ArrayList<Enrolls>();
              while(in.hasNextLine())
              {
                  String line=in.nextLine();
                  String[] parts=line.split(",");
                  menrolls.add(new Enrolls(parts[0],parts[1],Double.parseDouble(parts[2])));
                  
                  
              }
          } catch (IOException ex) 
          {
              
          } 
          
      }
    }
    
   //Διαγράφοντας μαθητή σύμφωνα με ΑΜ
   void removeStudent(){
       removal = JOptionPane.showInputDialog("Παρακαλώ δώστε ΑΜ φοιτητή");        
        //οσο ο μαθητής υπάρχει
        boolean found =true;
        while(found)
        {
            found=false;
            for(int i=0;i<menrolls.size();i++)
            {
                if(temp==0){
                if(menrolls.get(i).getam().equals(removal))
                {
                    menrolls.remove(i);
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
        //ΔΗΜΙΟΥΡΓΩΝΤΑΣ ΚΟΥΜΠΙ ΝΕΟ ΜΑΘΗΜΑ
        JPanel buttonPanel=new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2));
        addButton=new JButton("Νέο Μάθημα");
        addButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                    addEnroll();
            } 
        });
        //ΔΗΜΙΟΥΡΓΩΝΤΑΣ ΚΟΥΜΠΙ ΕΜΦΑΝΙΣΗ
        buttonPanel.add(addButton);
        showButton=new JButton("Εμφάνιση");
        buttonPanel.add(showButton);
        showButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                showEnroll();
            }
            
        });
        //ΔΗΜΙΟΥΡΓΩΝΤΑΣ ΚΟΥΜΠΙ ΑΠΟΘΥΚΕΥΣΗ
        saveButton=new JButton("Αποθύκευση");
        buttonPanel.add(saveButton);
        saveButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                saveEnroll();
            }
            
        });
        //ΔΗΜΙΟΥΡΓΩΝΤΑΣ ΚΟΥΜΠΙ ΦΟΡΤΩΣΗ
        loadButton=new JButton("Φόρτωση");
        buttonPanel.add(loadButton);
        loadButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                loadEnrolls();
            }
            
        });
        //ΔΗΜΙΟΥΡΓΩΝΤΑΣ ΚΟΥΜΠΙ ΔΙΑΓΡΑΦΗ ΜΑΘΗΤΗ
        removeButton = new JButton("Διαγραφή Μαθητή");
        buttonPanel.add(removeButton);
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                removeStudent();
            }

        });
        //ΚΟΥΜΠΙ ΕΜΦΑΝΙΣΗΣ ΕΠΙΔΟΣΕΩΝ
        performanceButton = new JButton("Εμφάνιση Επιδόσεων");
        buttonPanel.add(performanceButton);
        performanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                findPerformances();
                JOptionPane.showMessageDialog(null,"Βρέθηκαν επιδόσεις:"+showup);
                showup.clear();
            }

        });
       //ΚΟΥΜΠΙ ΕΜΦΑΝΙΣΗΣ ΜΑΘΗΤΗ
        studentButton = new JButton("Εμφάνιση Μαθητή");
        buttonPanel.add(studentButton);
        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                findStudent();
                JOptionPane.showMessageDialog(null,"Βρέθηκαν μαθητής:"+student+" και έχει μέσο όρο: "+avg);
                student.clear();
            }

        });
       
        add(buttonPanel);
    }
   
    
    
   
    //Φτιάχνοντας το EnrollFrame
    public EnrollFrame(String title)
    {
        super(title);
        setSize(1000,400);
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