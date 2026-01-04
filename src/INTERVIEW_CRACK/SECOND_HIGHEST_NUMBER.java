package INTERVIEW_CRACK;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SECOND_HIGHEST_NUMBER {
    static void main() {
        int[] arr = {3, 5, 2, 4, 5, 1};

        Integer result = findSecondHighest(arr);
        Integer result2 = findSecondHighestJava8(arr);
        System.out.println("Second highest number: " + result);
        System.out.println("Second highest number: " + result2);
    }
    public static Integer findSecondHighest(int[] arr) {
        if (arr == null || arr.length < 2) return null;

        Integer first = null;
        Integer second = null;

        for (int num : arr) {
            if (first == null || num > first) {
                second = first;
                first = num;
            } else if ((second == null || num > second) && num != first) {
                second = num;
            }
        }

        return second;
    }
    public static Integer findSecondHighestJava8(int[] arr) {
        if (arr == null || arr.length < 2) return null;

        List<Integer> list = Arrays.stream(arr)
                .boxed() // convert int to Integer
                .distinct() // remove duplicates
                .sorted(Comparator.reverseOrder()) // sort descending
                .collect(Collectors.toList());

        return list.size() >= 2 ? list.get(1) : null;
    }
}
