package DSA_CODING_2025_20LPA.JAVA8;

import java.util.Arrays;
import java.util.List;

/*
 from the given list of integer print the number which are multple of 5?

 */
public class DEMO1 {
    static void main() {
        List<Integer> list= Arrays.asList(10,25,30,42,50,7,15);
        list.stream()
                .filter(n->n%5 ==0)
                .forEach(System.out::println);
    }
}
