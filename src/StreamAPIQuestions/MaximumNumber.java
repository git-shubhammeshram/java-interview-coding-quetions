package StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);

        max.ifPresentOrElse(
                x -> System.out.println("Max values : "+max),
                () -> System.out.println("No Element Found"));
    }
}
