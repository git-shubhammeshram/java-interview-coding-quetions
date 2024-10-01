package StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinimumNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Optional<Integer> min = numbers.stream()
                .min(Integer::compare);

        min.ifPresentOrElse(
                x-> System.out.println("Min value : "+min),
                ()-> System.out.println("No Element Found")
        );
    }
}
