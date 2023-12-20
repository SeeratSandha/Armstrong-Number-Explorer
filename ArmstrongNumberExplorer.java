
/**
 * Assignment name = Armstrong Number Explorer 
 * Author = Seerat Sandha 
 * Date = 04/30/2023
 * e-mail = sand4927@bears.unco.edu
 */
import java.util.Scanner;
public class ArmstrongNumberExplorer
{
    static int lengthNumber ; 
  public static void main(String[] args) 
  {
// Prompting the  user  to enter  an integer between range 0 to 100,000.
   System.out.println("Enter the number between 0 and 100,000");
   Scanner scnr = new Scanner(System.in);
   int number = scnr.nextInt();
   int result;
   //lengthNumber= (""+number).length();// Converting the number to string to easily  find  number of digits.
   // checking whether number is between range or not using if ststement . 
   //If not then again prompting the user to enter the number between the specified range .
   if(number<1 || number>100000)
   {
       while(number<=1 || number>100000)
   {
    System.out.println("Enter the number between 0 and 100,000 .  Please try again !!");
    number = scnr.nextInt();
   }
   }
   else
   {
       System.out.println();
   }
   lengthNumber= (""+number).length();

   // Converting the number of digits into length . 
   System.out.println(number+ " is an Armstrong number? " +  isArmstrong(number));
   // calling the isArmstrong method to check whether number is armStrong or not.
   //lengthNumber= (""+number).length();
}
public static int sumOfDigits(int number) {
    
 if (number <10)
 {
    return (int) Math.pow(number,lengthNumber);
 }
 else
 {
    return sumOfDigits(number/10 )+ sumOfDigits(number%10);
    // calling the sumOfDigits method as a recurssive method to find the sum of digits to the power of theier length. 
 }
}
public static boolean isArmstrong(int number) 
{
     // if sumOfDigits is equal to the user Input then the number is ArmStrong number. 
     // Then return true , Else --- false . 
     
      if(number==sumOfDigits(number))
      {
       return true;
      }
      else
     {
        return false;
     }
    }
    
}




