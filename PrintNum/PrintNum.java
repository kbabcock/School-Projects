/**
 * This program asks for 3 numbers and then prints the numbers in non descending order. Enjoy.
 * Written by Kris Babcock
 */
import java.io.*; 
import java.util.*; 

public class PrintNum { 
   public static void main(String[] args) { 
      Scanner q=new Scanner(System.in); 
      System.out.println("Input three numbers separated by a space"); 
int i[] = new int[3]; 
   i[0]=q.nextInt(); 
   i[1]=q.nextInt(); 
   i[2]=q.nextInt(); 
Arrays.sort(i); 
   System.out.println(i[0]+","+i[1]+","+i[2]); 
   } 

}