import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner scr = new Scanner(System.in);
		//Prints a right angle triangle based on the number of stars given. The length of the base is 
		//determined by the value that the user has input. 
		System.out.print("Please enter the length of the base: ");
		int len = scr.nextInt(); 
		do {
			for (int i = 0; i < len; i++) {
				System.out.print("*");
			}
			System.out.println(); 
			len--; 
		} 
		while (len > 0); 
  }
}
