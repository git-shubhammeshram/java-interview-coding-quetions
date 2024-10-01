package StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class CheckAnyNumberIsDivisibleByThree {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        boolean result = numbers.stream()
                .anyMatch(x -> x % 3 == 0);
        System.out.println(result);
    }
}
