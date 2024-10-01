package StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElemetInTheList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional<Integer> first = numbers.stream().findFirst();
        first.ifPresentOrElse(
                x-> System.out.println("First Element:"+first),
                ()-> System.out.println("No Element")
        );
    }
}
