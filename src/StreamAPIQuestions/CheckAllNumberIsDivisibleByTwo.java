package StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class CheckAllNumberIsDivisibleByTwo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        boolean result = numbers.stream()
                .allMatch(x -> x % 2 == 0);
        System.out.println(result);

    }
}
