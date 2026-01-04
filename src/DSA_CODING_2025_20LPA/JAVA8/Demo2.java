package DSA_CODING_2025_20LPA.JAVA8;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
  Reverse each word from string
 */
public class Demo2 {
    static void main() {
        String str="Java stream are easy";

        // so  there is no inbuild method in stream to revers so used stringBuilder
        String reverseStr=Arrays.stream(str.split(" "))
                .map(word-> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(reverseStr);
    }
}
