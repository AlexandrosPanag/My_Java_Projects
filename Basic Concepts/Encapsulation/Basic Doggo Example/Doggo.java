// By Alexandros panagiotakopoulos - alexandrospanag.github.io


package com.mycompany.encapsulation;

public class Doggo{
     
    private int size;  //make the instance variable PRIVATE
    
    public int getSize(){ //make the setter and getter methods PUBLIC
        return size;
    }
    
    public void setSize(int s){ //make the setter and getter methods PUBLIC
        size=s;
    }
    
    //methods example
    void bark(){
        if(size>60){
        System.out.println("Woof! Woof!");
        }
        else if(size>14){
        System.out.println("Ruff! RuffS!");
        }
        else{
        System.out.println("Yip! Yip!");
        }
    }