package JAVA8_QUESTIONS;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
  How to find duplicate number from an integer list using java8 streams??
  we have 2 approach
  1.using collector.groupingBy()
 */
public class FindDuplicateNumber {
    static void main() {
        List<Integer> nums=List.of(1,2,3,4,51,6,2,2,1);

        nums.stream()
                .collect(Collectors.groupingBy(n->n, Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue()>1)
                .forEach(e-> System.out.println(e.getKey()));

        System.out.println("---------------------");

        //approach2 using a set
        Set<Integer> seen=new HashSet<>();
        nums.stream()
                .filter(n->!seen.add(n))//only duplicate value
                .distinct()// bcs i want to distict out similar value
                .forEach(System.out::println);



    }
}
