package JAVA8_QUESTIONS.Java8QuestionInterview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {
    static void main() {
      String str="vvababcca";

      Map<Character, Long> po=str.chars().mapToObj(character->(char) character)
              .collect(Collectors.groupingBy(character -> character, TreeMap::new,Collectors.counting()));
        System.out.println(po); // treeMap::new used bcs sorted key

    }
}
