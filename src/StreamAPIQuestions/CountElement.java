package StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class CountElement {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,8,9, 2, 3, 4, 5, 6);

        long count = numbers.stream()
                .count();

        System.out.println(count);

    }
}
