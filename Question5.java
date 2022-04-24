import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner scr = new Scanner(System.in);
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
		int i; 
	        int targetIndex = 0; 
	        
		//unexpected fault occurred at infinite loop. 
		//PROBLEM: VALUE STUCK AT 2 
		for(;;) { 
			for (i = 0; i < a.size(); i++) {
				if (i + 1 < a.size()) { //prevent the index out of range 
					if (a.get(i).equals(a.get(i + 1))) { //equal string found... 
						for (String k : keys) { //loop through the arrayList named 'keys' 
							if (k.equals(a.get(i))) { //get the index position of the target index in the Object[] 
								targetIndex = i; 
								a.remove(targetIndex); 
								int val = values.get(keys.indexOf(k)); 
								val = val + 1; 
								values.set(keys.indexOf(k), val); 
								break; 
							} 
						} 
					}
					else {   //!a.get(i).equals(a.get(i + 1)) 
						targetIndex = i;
						a.remove(targetIndex); 
						break; 
					}
				} 
				else {
					targetIndex = i; 
					a.remove(targetIndex); 
					break; 
				}
			} 
			if (a.size() == 0) {
				break; 
			}
		}
		
		ArrayList<Integer> n = new ArrayList<Integer>(); 
		
		//run a for loop through Object[] tempValues again.  
		for(int i = 0; i < values.size(); i++) {
			n.add(values.get(i)); 
			System.out.println(values.get(i));
		}
		
		//FindMax(ArrayList<Integer> a) returns the highest occurrence 
		if (FindMax(n) != -1) {
			int ab = n.indexOf(FindMax(n)); //location of the highest value in the array. 
			item = keys.get(ab); //get the item from the keys
			System.out.print("The highest occurrence of a particular element in the array is " + FindMax(n) + " times and that element is: " + item);
		} 
		else {
			System.out.print("There is no mode.");
		}
  }
  
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
