import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
      Scanner scr = new Scanner(System.in); 
      //prompt the user for height and weight, calculate the bmi, and then display the bmi back to the user... 
      System.out.print("Please enter your weight(in kilograms): ");
      double weight = scr.nextDouble(); 
      System.out.print("Thanks. Now please enter your height (in metres): ");
      double height = scr.nextDouble(); 
      double bmi = weight / Math.pow(height, 2); 
      System.out.println("Your bmi is: " + bmi); 
  }
}
