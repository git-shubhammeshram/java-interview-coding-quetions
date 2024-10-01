package StreamAPIQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Shubham","Avant","Baldev","Rahul","Aditya");

        list.stream().sorted().toList().forEach(System.out::println);
    }
}
