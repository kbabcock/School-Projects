/**
 * All it does is flip the number you enter. Seriously. Enjoy.
 * Written by Kris Babcock for Module 7.
 */
import java.util.Scanner;
import java.io.*;
public class reverseDigit {
  public static void main (String args[]) {
    Scanner in = new Scanner(System.in);
        
    int n=0;
    int rev_n = 0; 
    
    System.out.println("Enter your number");
    n = in.nextInt();
        
    while (n > 0) { 
            
      rev_n *= 10; 
      rev_n += n % 10; 
      n /= 10;            
    } 
    System.out.println("Enter your number reversed is " + rev_n);
  }
}