package JAVA8_QUESTIONS.INTERVIEW;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElementSubstring {
    public static void main(String[] args)
    {

        List<String> list= Arrays.asList("apple","banana","cherry","kiwi");

        String substringToRemove="a";

        List<String> ff=list.stream().filter(word->!word.contains(substringToRemove)).collect(Collectors.toList());

        System.out.println(ff);
    }

}
