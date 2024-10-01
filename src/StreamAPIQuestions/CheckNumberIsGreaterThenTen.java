package StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class CheckNumberIsGreaterThenTen {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6,11);
        boolean result = numbers.stream()
                .noneMatch(x -> x > 10);
        System.out.println(result);
    }
}
