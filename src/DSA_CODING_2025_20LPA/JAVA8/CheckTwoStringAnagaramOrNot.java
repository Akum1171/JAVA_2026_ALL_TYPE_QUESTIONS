package DSA_CODING_2025_20LPA.JAVA8;

import java.util.Arrays;

public class CheckTwoStringAnagaramOrNot {
    static void main() {
        String str1="abc";
        String str2="bag";

        boolean areAnaragram= areAnagram(str1,str2);
        System.out.println("Are the string anagrams : "+ areAnaragram);

    }
    public static boolean areAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return  false;
        }
        return str1.chars()//ascii value
                .sorted()
                .mapToObj(ch-> (char)ch).toList()
                .equals(str2.chars()
                        .sorted()
                        .mapToObj(ch-> (char)ch).toList());


    }
}

