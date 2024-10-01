package StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUpperCase {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .toList();
        upperCaseWords.forEach(System.out::println);

    }

}
