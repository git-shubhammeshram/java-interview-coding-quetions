package StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,1,9, 9, 3, 3, 5);

        Optional<Integer> distinct = numbers.stream()
                .distinct().findFirst();
        System.out.println(distinct);
    }
}
