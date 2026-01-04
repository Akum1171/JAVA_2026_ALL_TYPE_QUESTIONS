package DSA_CODING_2025_20LPA.STRING;

import java.util.Arrays;

public class CheckTwoStringAnagaramOrNot {
    static void main() {
        String str1="abc";
        String str2="bac";

        boolean areAnaragram= areAnagram(str1,str2);
        System.out.println("Are the string anagrams : "+ areAnaragram);

    }
    public static boolean areAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return  false;
        }
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        return Arrays.equals(charArr1,charArr2);
    }
}

