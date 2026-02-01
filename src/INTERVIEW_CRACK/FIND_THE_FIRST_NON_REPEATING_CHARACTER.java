package INTERVIEW_CRACK;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
  Feature	                 Reason
LinkedHashMap	    Maintains insertion order (to find “first”)
getOrDefault()    	Avoids null checks
Two linear scans	O(n) time complexity
Constant space	    Only up to 256 characters (ASCII)
 */
public class FIND_THE_FIRST_NON_REPEATING_CHARACTER {

    static void main() {
        String input = "swviss";
        Character result = findFirstNonRepeatingChar(input);
        Character result2= findFirstNonRepeatingCharJava8(input);

        System.out.println("First non-repeating character: " + result);
        System.out.println("First non-repeating character: " + result2);
    }


    public static Character findFirstNonRepeatingChar(String str){
       if(str==null || str.isEmpty()){
           return null;
       }

        // Step 1: Store frequency of each character in LinkedHashMap to maintain order
        Map<Character,Integer> countMap=new LinkedHashMap<>();

       for(char c: str.toCharArray()){
           countMap.put(c, countMap.getOrDefault(c,0)+1);
       }

        System.out.println("----------------------------------------");
       for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
           if(entry.getValue()==1){
               return entry.getKey();
           }
       }
       return null;

    }

    //java 8
    public static Character findFirstNonRepeatingCharJava8(String input) {
        /*
      Key points:
      LinkedHashMap keeps insertion order — that’s why you get the first non-repeating character.
      .collect(Collectors.counting()) gives frequency count for each character.
      .findFirst() ensures we get the first occurrence only.
         */
        if (input == null || input.isEmpty()) {
            return null;
        }

        return input.chars() // IntStream of characters
                .mapToObj(c -> (char) c) // convert to Character stream
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new, // preserve order
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1) // only unique chars
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

}
