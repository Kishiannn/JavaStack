package com.mycompany.stackjava;

import java.util.Stack;



public class StackJava {

    public static void main(String[] args) {
        Stack<String> myHobbies = new Stack <String>();
        
        myHobbies.push("Martial Arts");
        myHobbies.push("Reading Manga");
        myHobbies.push("Coding");
        myHobbies.push("Guitar");
        
        System.out.print(myHobbies);
    }
}
