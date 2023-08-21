// By Alexandros panagiotakopoulos - alexandrospanag.github.io

package com.mycompany.encapsulation;

    
class Main{       
    public static void main(String[] args){
    
    Doggo one = new Doggo();
    one.setSize(10);
    
    Doggo two = new Doggo();
    two.setSize(70);
    
    Doggo three = new Doggo();
    three.setSize(13);
    System.out.println("Doggo one:"+one.getSize());
    System.out.println("Doggo two:"+two.getSize());
    System.out.println("Doggo three:"+three.getSize());
    one.bark();
    two.bark();
    three.bark();
    }
}
