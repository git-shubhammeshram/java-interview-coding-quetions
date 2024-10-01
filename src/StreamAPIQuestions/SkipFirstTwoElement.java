package StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipFirstTwoElement {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,1,9, 9, 3, 3, 5);

        List<Integer> result = numbers.stream()
                .skip(2)
                .toList();
        System.out.println(result);
    }
}
