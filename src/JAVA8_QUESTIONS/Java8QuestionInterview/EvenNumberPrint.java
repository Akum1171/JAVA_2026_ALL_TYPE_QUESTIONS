package JAVA8_QUESTIONS.Java8QuestionInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberPrint {
    static void main() {
        List<Integer> list= Arrays.asList(2,4,6,81);
        List<Integer> k=list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(k);

    }
}
