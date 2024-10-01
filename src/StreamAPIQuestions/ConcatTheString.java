package StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatTheString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Shubham","Avant","Baldev","Rahul","Aditya");
        String result = list.stream()
                .collect(Collectors.joining(","));

        System.out.println(result);
    }
}
