/** 
 * A simple program for module 1 that rounds numbers to the nearest integter. Enjoy.
 */
import java.util.*;  
import static java.lang.Math.*;  
public class DecimalRounder  
{  
    static Scanner console = new Scanner(System.in);  
      
    public static void main(String[] args)  
    {  
        long answer;  
        double input;  
           
          
        System.out.println("Enter any decimal number. It will be rounded to the nearest integer.");  
          
          
        input = console.nextDouble();  
          
        System.out.println("You entered" + " " + input);  
          
        answer = round(input);  
          
        System.out.println("The answer is" + " " + answer);  
          
    }  
      
}  