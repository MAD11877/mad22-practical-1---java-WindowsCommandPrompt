/* Done by Li Zhe Yun, 5th September 2023 LOL*/ 
/* Prompt user for a number (number of elements to be inserted into the list. Prompt user for the number, once done, find mode */ 
package main; 

import java.util.*; 
import java.util.stream.*;
import java.util.function.*; 

public class Question5Update { 
    public static void main(String[] args) {
        try (Scanner scr = new Scanner(System.in)){ 
            System.out.print("Enter the number of entries (Greater than or equal to 0): "); 
            int numEntries = scr.nextInt(); 
            while (numEntries < 0){
                System.out.print("Enter the number of entries (Greater than or equal to 0): "); 
                numEntries = scr.nextInt(); 
            }
            ArrayList<Integer> numbers = new ArrayList<>(); 
            for (int i = 0; i < numEntries; i++){
                System.out.print(String.format("Enter a number to be inserted at index %d: ", i)); 
                int entry = scr.nextInt(); 
                numbers.add(entry); 
            }
            Stream<Long> values = Stream.of(
                IntStream
                .range(0, numbers.size())
                .boxed()
                .collect(Collectors.groupingBy(
                    i -> numbers.get(i), 
                    Collectors.mapping(
                        i -> i, 
                        Collectors.counting()
                    )
                ))
            )
            .flatMap(i -> i.values().stream());
            long values_length = Stream.of(
                IntStream
                .range(0, numbers.size())
                .boxed()
                .collect(Collectors.groupingBy(
                    i -> numbers.get(i), 
                    Collectors.mapping(
                        i -> i, 
                        Collectors.counting()
                    )
                ))
            )
            .flatMap(i -> i.values().stream())
            .count(); 
            Stream<Long> values_distinct = Stream.of(
                IntStream
                .range(0, numbers.size())
                .boxed()
                .collect(Collectors.groupingBy(
                    i -> numbers.get(i), 
                    Collectors.mapping(
                        i -> i, 
                        Collectors.counting()
                    )
                ))
            )
            .flatMap(i -> i.values().stream())
            .distinct();  
            long values_distinct_length = Stream.of(
                IntStream
                .range(0, numbers.size())
                .boxed()
                .collect(Collectors.groupingBy(
                    i -> numbers.get(i), 
                    Collectors.mapping(
                        i -> i, 
                        Collectors.counting()
                    )
                ))
            )
            .flatMap(i -> i.values().stream())
            .distinct()
            .count(); 
            List<Integer> keys = Stream.of(
                IntStream
                .range(0, numbers.size())
                .boxed()
                .collect(Collectors.groupingBy(
                    i -> numbers.get(i), 
                    Collectors.mapping(
                        i -> i, 
                        Collectors.counting()
                    )
                ))
            )
            .flatMap(i -> i.keySet().stream())
            .collect(Collectors.toList());
            if (values_distinct_length != values_length){
                System.out.println("No mode"); 
            } else {
                List<Long> result = values.collect(Collectors.toList()); 
                long repetitions = values_distinct.max(Long::compare).get(); 
                int key = keys.get(result.indexOf(repetitions)); 
                System.out.println(String.format("Number: %d is the mode. It occurred %d times in the list.", key, repetitions)); 
            }
        } catch( Exception e) {
            e.printStackTrace(); 
        }
    }
} 
