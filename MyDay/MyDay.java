import java.util.*;
 
//------------------------------------------------------------------
// Module 8 by Kris Babcock.
// So I decided to go a different route than what was expected.
// It works well but I'm sure you'll find a way to break it. 
//------------------------------------------------------------------
 
public class MyDay
{
      // init standard input object
      static Scanner readinput = new Scanner(System.in);
 
      // member variable, private by default
      String day;
      // constructor with "Sunday" value
      public MyDay(String day)
      {
         day = "Sunday";
      }
      // set the day
      public void setDay(String theDay)
      {
         day = theDay;
      }
      // print or return the day
      public String getDay()
      {
         return day;
      }
      // print the day.
      public void printDay()
      {
         System.out.println("When printing, your day is " + day);
      }
      // return the next day
      public String getNextDay()
      {
         // so use compareTo() method...
         if((day.compareTo("Saturday") == 0) || (day.compareTo("Sat") == 0))
            return ("Sunday");
         else if((day.compareTo("Sunday") == 0) || (day.compareTo("Sun") == 0))
            return ("Monday");
         else if((day.compareTo("Monday") == 0) || (day.compareTo("Mon") == 0))
            return ("Tuesday");
         else if((day.compareTo("Tuesday") == 0) || (day.compareTo("Tue") == 0))
            return ("Wednesday");
         else if((day.compareTo("Wednesday") == 0) || (day.compareTo("Wed") == 0))
            return ("Thursday");
         else if((day.compareTo("Thursday") == 0) || (day.compareTo("Thu") == 0))
            return ("Friday");
         else if((day.compareTo("Friday") == 0) || (day.compareTo("Fri") == 0))
            return ("Saturday");
         else
            return ("\"ERROR!\"");
      }
      // return the previous day
      public String getPreDay()
      {
         if((day.compareTo("Friday") == 0) || (day.compareTo("Fri") == 0))
            return ("Thursday");
         else if((day.compareTo("Thursday") == 0) || (day.compareTo("Thu") == 0))
            return ("Wednesday");
         else if((day.compareTo("Wednesday") == 0) || (day.compareTo("Wed") == 0))
            return ("Tuesday");
         else if((day.compareTo("Tuesday") == 0) || (day.compareTo("Tue") == 0))
            return ("Monday");
         else if((day.compareTo("Monday") == 0) || (day.compareTo("Mon") == 0))
            return ("Sunday");
         else if((day.compareTo("Sunday") == 0) || (day.compareTo("Sun") == 0))
            return ("Saturday");
         else if((day.compareTo("Saturday") == 0) || (day.compareTo("Sat") == 0))
            return ("Friday");
         else
            return ("\"ERROR!\"");
      }
      
      // return the previous day
      public String get8Day()
      {
         if((day.compareTo("Friday") == 0) || (day.compareTo("Fri") == 0))
            return ("Saturday");
         else if((day.compareTo("Thursday") == 0) || (day.compareTo("Thu") == 0))
            return ("Friday");
         else if((day.compareTo("Wednesday") == 0) || (day.compareTo("Wed") == 0))
            return ("Thursday");
         else if((day.compareTo("Tuesday") == 0) || (day.compareTo("Tue") == 0))
            return ("Wednesday");
         else if((day.compareTo("Monday") == 0) || (day.compareTo("Mon") == 0))
            return ("Tuesday");
         else if((day.compareTo("Sunday") == 0) || (day.compareTo("Sun") == 0))
            return ("Monday");
         else if((day.compareTo("Saturday") == 0) || (day.compareTo("Sat") == 0))
            return ("Sunday");
         else
            return ("\"ERROR!\"");
      }

     
      // main execution point
      public static void main (String args[])
      {
         // with "Sun" as initial value....
         MyDay testday = new MyDay("Sun");
         // prompt user to set his/her day
         System.out.print("Enter day to set your day: ");
         // read and store user's day
         String storeday = readinput.nextLine();
         // invoke setDay() method to set a day defined by user
         testday.setDay(storeday);
         // invoke getDay() method to get a day
         System.out.println("Your day is " + testday.getDay());
         // test printing by invoking printDay() method
         testday.printDay();
         // invoke getPreDay() method to get the previous day
         System.out.println("Your previous day is " + testday.getPreDay());
         // invoke getNextDay() method to get the next day
         System.out.println("Your next day is " + testday.getNextDay());
         // invoke get8Day() method to get the next day
         System.out.println("8 Days from now would be " + testday.get8Day());

      }
}