//***********************************************************************
// Project: Program
//
// Author: Craig Tuschhoff
//
// Completion time: 3 hours total
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from (write names here or no one) in designing and
// debugging my program.
//***********************************************************************

import java.util.*;

public class MonthDemo {
   public static void main(String[] args) {
      
      //prepare elements to accept userInput and verify
      Scanner keyboard = new Scanner(System.in);
      String userInput;
      Month userMonth;
      boolean validEntry = false;
      
      while(!validEntry) {
      
         //prompt the user for input
         System.out.print("Enter a month: ");
         userInput = keyboard.next();
         
         //try and create the month object based on userInput
         try{
            userMonth = new Month(userInput);
            System.out.println("You've entered " + userMonth);
            validEntry = true;
         
         //catch invalid entries and display message
         } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
         }
      }
   }
}