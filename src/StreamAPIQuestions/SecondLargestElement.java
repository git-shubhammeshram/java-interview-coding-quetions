package StreamAPIQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestElement {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40,50,60);

        Optional<Integer> secondLargest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        System.out.println(secondLargest);
    }
}
