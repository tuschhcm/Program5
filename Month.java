import java.lang.*;

public class Month{

   //instance fields
   private int monthNumber;
   final static String[] monthNames = {"January", "February", "March", "April","May",
      "June", "July", "August", "September", "October", "November", "December"};
   
   //Constructor
   public Month(int m) {
      setMonthNumber(m);
   }
   
   //Constructor
   public Month(String s) {
      
      //try to interpret string as in int, otherwise search for
      //value in monthNames array
      try{
         setMonthNumber(Integer.parseInt(s));
      } catch(NumberFormatException e) {
         setMonthName(s);
      }
   }
   
   //accepts an int arg and sets monthNumber to it
   public void setMonthNumber(int m) {
      if(m < 1 || m > 12) {
         throw new IllegalArgumentException("Illegal month number: " + m);
      } else monthNumber = m;
   }
   
   //accepts a String arg and sets monthNumber to
   //corresponding month number
   public void setMonthName(String name) {
      
      //determine if illegal arg submitted
      boolean validMonth = false;
      
      for(int i = 0; i < monthNames.length; i++) {
         if(monthNames[i].equalsIgnoreCase(name)) {
            monthNumber = ++i;
            validMonth = true;
            break;   
         } else {
            validMonth = false;
         }
      }
      
      //if illegal arg, throw exception
      if(!validMonth) throw new IllegalArgumentException(
         "Invalid month name: " + name);
   }
   
   //returns monthNumber of instance
   public int getMonthNumber() {
      return monthNumber;
   }
   
   //returns the month name of instance by looking it
   //up in the array monthNames
   public String getMonthName() { 
      return monthNames[monthNumber - 1];
   }
   
   //return string representation of instance
   public String toString() {
      return getMonthName();
   }
   
   //determine if the current instance and the one
   //one passed in are equal
   public boolean equals(Month m) {
      if (m.monthNumber == this.monthNumber) {
         return true;
      } else {
         return false;
      }
   }
   
   //return a new month object of the value one month ahead
   public Month next() {
      int nextMonth = monthNumber + 1;
      if(nextMonth > 12) {
         nextMonth = 1;
      }
      return new Month(nextMonth);
   }
   
   //return a new month object of the value one month behind
   public Month previous() {
      int prevMonth = monthNumber - 1;
      if(prevMonth < 1) {
         prevMonth = 12;
      }
      return new Month(prevMonth);
   }
}