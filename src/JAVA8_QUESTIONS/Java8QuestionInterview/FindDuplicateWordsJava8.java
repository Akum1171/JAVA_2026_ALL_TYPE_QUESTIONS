package JAVA8_QUESTIONS.Java8QuestionInterview;

import java.util.Arrays;
import java.util.stream.Collectors;

import java.util.*;
import java.util.stream.*;

public class FindDuplicateWordsJava8 {

     static void main(String[] args) {

        String str = "Learn java learn python also match also";

        Arrays.stream(str.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));


    }
}
