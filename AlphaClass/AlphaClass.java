/**
 * Another Short Simple Program. Enjoy.
 * Written by Kris Babcock for Module 5.
 */
import java.util.*;

public class AlphaClass 
{ 
   public static void main(String args[]) 
   { 
      double[] alpha = new double[50]; 
      for(int i = 0; i < 25; i++) 
      { 
         alpha[i]= i * i; 
      } 

      for(int i = 25; i < 50; i++) 
      { 
         alpha[i]= 3 * i; 
      } 

/*Print*/
AlphaClass printClass = new AlphaClass(); 
   printClass.print(alpha); 

   } 

void print(double m_array[]) 
   { 
      for(int i =1; i <= m_array.length; i++) 
      { 
         System.out.print(m_array[i-1] +" "); 
         if(i%10==0) 
         System.out.print("\n"); 
      } 
   } 
}