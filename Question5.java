import java.util.Scanner;

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
		
		Object[] objArr = newHashSet.toArray(); 
		
		for (int i = 0; i < objArr.length; i++) {
			newHashMap.put((String) objArr[i], 1); 
		}
		
		HashSet<String> keys = new HashSet<String>(newHashMap.keySet()); //store the keys in a set. 
		Object[] tempKeys = keys.toArray(); 
		HashSet<Object> values = new HashSet<Object>(newHashMap.values()); //store the values in a set.
		Object[] tempValues = values.toArray(); 
		int pos = 0; 
		
		for (int i = 0; i < a.size(); i++) {
			if (i + 1 < a.size()) {
				if (a.get(i).equals(a.get(i + 1))) {
					for (int j = 0; j < tempKeys.length; j++) {
						if (tempKeys[j] == a.get(i)) { //get the index position of the target index in the Object[] 
							
							
							
						}
					}
				}
			}
		} 
		
		System.out.println(pos); 
  }
  
  public static Object FindMax(int[] a) {
		int max = 0; 
		for (int i = 0; i < a.length; i++) {
			if (i + 1 < a.length) {
				if (a[i + 1] > a[i]) {
					max = a[i + 1]; 
					//compare last element with second last element... 
					if (max > a[a.length - 1]) {
						return max; 
					}
					else {
						return a[a.length - 1]; 
					}
				}
				else {
					max = a[i]; 
					//compare last element with second last element... 
					if (max > a[a.length - 1]) {
						return max;
					}
					else {
						return a[a.length - 1]; 
					}
				}
			}
			else {
				return "No max"; 
			}
		}
		return "No max"; 
	}
}
