package Package;

import java.util.*; 
//ORIGINAL FILE COMPLETED BY ZHE YUN. DO NOT MODIFY. THANK YOU. 


public class Practical_1 {

	public Practical_1() {
		// TODO Auto-generated constructor stub
	}
	
	public static Scanner scr = new Scanner(System.in); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Run either Question5() or Test() one of them should work. 
		
	    Question5(); 
	    
	    
	    //Question1(); 
	    //Question2(); 
	    //Question3(); 
	    //Question4(); 
	}
	
	public static void Question1() {
		System.out.println("Hello World!");
	}
	
	public static void Question2() {
		//prompt the user for height and weight, calculate the bmi, and then display the bmi back to the user... 
		System.out.print("Please enter your weight(in kilograms): ");
		double weight = scr.nextDouble(); 
		System.out.print("Thanks. Now please enter your height (in metres): ");
		double height = scr.nextDouble(); 
		double bmi = weight / Math.pow(height, 2); 
		System.out.println("Your bmi is: " + String.format("%.2f", bmi)); 
	}
	
	public static void Question3() {
		//Reads the integer entered by the user, multiplies by itself and then prints out the result... 
		System.out.print("Please enter a number: ");
		double num = scr.nextDouble(); 
		double result = Math.pow(num, num); 
		System.out.println("The result when the number is multiplied by itself is: " + result); 
	}
	
	public static void Question4() {
		//System.out.
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
    
	public static void Question5() {
		//find the highest occurrences of an element within an array.... 
		ArrayList<String> a = new ArrayList<String>(); 
		HashMap<String, Integer> newHashMap = new HashMap<String, Integer>(); 
		HashSet<String> newHashSet = new HashSet<String>(); 
		int counter, response; 
		int target = 0; 
		
		System.out.print("Please enter the number of elements that would be entered into a list: ");
		
		response = scr.nextInt(); 
		counter = 1; 
		
		do {
			System.out.print("Please enter an element at position no. " + counter  + ": ");
			String entry = scr.next();   
			a.add(entry); 
			newHashSet.add(entry); 
			counter++; 
		}
		while (counter <= response); 
		
		//convert the arrayList into a hashSet
		
		String[] objArr = newHashSet.toArray(new String[newHashSet.size()]); 
		
		for (int i = 0; i < objArr.length; i++) {
			newHashMap.put((String) objArr[i], 1); 
		}
		
		ArrayList<String> keys = new ArrayList<String>(newHashMap.keySet()); //store the keys in a set. 
		ArrayList<Integer> values = new ArrayList<Integer>(newHashMap.values()); //store the values in a set.
		String item = null; 
		int targetIndex = 0; 
		int i;
		
		//unexpected fault occurred at infinite loop. 
		for(;;) { 
			A: //add label named 'A' 
			for (i = 0; i < a.size(); i++) {
				if (i + 1 < a.size()) { //prevent the index out of range 
					if (a.get(i).equals(a.get(i + 1))) { //equal string found... 
						for (String k : keys) { //loop through the arrayList named 'keys' 
							if (k.equals(a.get(i))) { //get the index position of the target index in the Object[] 
								targetIndex = i; //capture the index position 
								a.remove(targetIndex); //remove it. The size of the arrayList would also decrease by 1
								values.set(keys.indexOf(k), values.get(keys.indexOf(k)) + 1);  //set it back 
								break A; //go back to A
							} 
						} 
					}
					else {
						targetIndex = i; //capture the index position 
						a.remove(targetIndex); //remove it. The size of the arrayList would also decrease by 1 
						break A; //go back to A
					}
				} 
				else {
					targetIndex = i; 
					a.remove(targetIndex);  
					break A; //go back to A
				}
			} 
			if (a.size() == 0) {
				break; //exit for(;;) 
			}
		} 
		
		ArrayList<Integer> n = new ArrayList<Integer>(); 
		
		//run a for loop through Object[] tempValues again.  
		for(i = 0; i < values.size(); i++) {
			n.add(values.get(i)); //arraylist n stores all the values...  
		}
		
		//check whether all the information are correct... 
		System.out.println(n);  
		
		//FindMax(ArrayList<Integer> a) returns an Object 'Highest value in an array' or 'No Mode' meaning no highest value in the array
		if (FindMax(n) != -1) {
			int ab = n.indexOf(FindMax(n)); //location of the highest value in the array. 
			item = keys.get(ab); //get the item from the keys
			System.out.print("The highest occurrence of a particular element in the array is " + FindMax(n) + " times and that element is: " + item);
		} 
		else {
			System.out.print("There is no mode.");
		}
	}
	
	
	public static void SortArrByInteger(ArrayList<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			
		}
	}
	
	public static void SortArrByString(ArrayList<String> a) {
		for (int i = 0; i < a.size(); i++) {
			
		}
	}
	
	
	//The following method returns the max value without an array, int[], only. DO NOT REMOVE THE FOLLOWING METHOD
	public static Integer FindMax(ArrayList<Integer> a) {
		int max = 0; 
		for (int i = 0; i < a.size(); i++) {
			if (i + 1 < a.size()) {
				if (a.get(i + 1) > a.get(i)) {
					max = a.get(i + 1); 
					//compare last element with second last element... 
					if (max > a.get(a.size() - 1)) {
						return max; 
					}
					else {
						return a.get(a.size() - 1); 
					}
				}
				else if (a.get(i + 1) == a.get(i)) {
					return -1; 
				}
				else {
					max = a.get(i); 
					//compare last element with second last element... 
					if (max > a.get(a.size() - 1)) {
						return max;
					}
					else {
						return a.get(a.size() - 1); 
					}
				}
			}
		}
		if (a.size() == 1) {
			max = a.get(a.size() - 1);
			return max; 
		}
		return -1; 
	}
}

//extends implements int double float byte boolean long short char while for do new if else true false null 
