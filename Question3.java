import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner scr = new Scanner(System.in);
    //Reads the integer entered by the user, multiplies by itself and then prints out the result... 
		System.out.print("Please enter a number: ");
		double num = scr.nextDouble(); 
		double result = Math.pow(num, num); 
		System.out.println("The result when the number is multiplied by itself is: " + result); 
  }
}
