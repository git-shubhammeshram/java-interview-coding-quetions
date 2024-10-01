package StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertLowerCase {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("APPLE", "BANANA", "CHERRY");
        List<String> result = words.stream()
                .map(String::toLowerCase)
                .toList();

        result.forEach(System.out::println);

    }
}
