//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
       String compliment0 = "Nice hair";
       String compliment1 = "Nice shirt";
       String compliment2 = "nice pants";
       String compliment3 = "nice shoes";
       String compliment4 = "cool personality";
       if(randomNumber == 0) {
    	   JOptionPane.showMessageDialog(null, compliment0);
       }
       else if(randomNumber == 1) {
    	   JOptionPane.showMessageDialog(null, compliment1);
       }
       else if(randomNumber == 2) {
    	   JOptionPane.showMessageDialog(null, compliment2);
       }
       else if(randomNumber == 3) {
    	   JOptionPane.showMessageDialog(null, compliment3);
       }
       else {
    	   JOptionPane.showMessageDialog(null, compliment4);
       }
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
