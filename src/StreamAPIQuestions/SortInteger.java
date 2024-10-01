package StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class SortInteger {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,8,9, 2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .sorted()
                .toList();

        System.out.println(result);
    }
}
