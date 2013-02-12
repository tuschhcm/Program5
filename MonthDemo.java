import java.util.*;

public class MonthDemo {
   public static void main(String[] args) {
      
      //scanner object to accept user input
      Scanner keyboard = new Scanner(System.in);
      String userInput;
      Month userMonth;
      boolean validEntry = false;
      
      while(!validEntry) {
         System.out.print("Enter a month: ");
         userInput = keyboard.next();
         
         try{
            userMonth = new Month(userInput);
            System.out.println("You've entered " + userMonth);
            validEntry = true;
         } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
         }
      }
   }
}