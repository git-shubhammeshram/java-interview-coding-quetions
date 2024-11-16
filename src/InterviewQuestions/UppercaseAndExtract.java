package InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseAndExtract {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Spring","Angular","Java","RestAPI");

        List<String> collect = list.stream()
                .map(String::toUpperCase)
                .filter(words -> words.length() > 4)
                .toList();

        collect.forEach(System.out::println);

    }
}
