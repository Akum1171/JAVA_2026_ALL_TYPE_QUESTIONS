package JAVA8_QUESTIONS.Java8QuestionInterview;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class MergeElementFromTwoArray {
    static void main() {
        //I have to merge two list using java8

        List<Integer> list1=Arrays.asList(1,2,3,4,5,6);

        List<Integer> list2=Arrays.asList(4,5,6,7,8,9);

        //merge the list
        Stream<Integer> fullList = Stream.concat(list1.stream(), list2.stream());

        List<Integer> allElements=fullList.collect(Collectors.toList());
        System.out.println( allElements);//[1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 8, 9] here merged


        //question 2:- another if i want fetch duplicate element form all elements then this logic
        Set<Integer> set=new HashSet();
        allElements.stream().filter(n->!set.add(n)).forEach(System.out::println);



        //question 3:which you merged above just removed duplicate element and print like print only unique element
        Set<Integer> uniqueElement=allElements.stream().collect(Collectors.toSet());
        System.out.println(uniqueElement);


        //question 4: find the minimum and maximum element
        Integer min = uniqueElement.stream().min((x1,x2)->x1-x2).get();
        System.out.println(min);

        Integer max = uniqueElement.stream().max((x1,x2)->x1-x2).get();
        System.out.println(max);


    }

}