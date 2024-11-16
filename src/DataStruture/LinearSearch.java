package DataStruture;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;



public class LinearSearch {
    public static void getElement(int target){
        List<Integer> numbers = Arrays.asList(34, 12, 9, 75, 58, 19);
        OptionalInt index = IntStream.range(0, numbers.size())
                .filter(x -> numbers.get(x) == target)
                .findFirst();

        if(index.isPresent())
            System.out.println(target+" "+" present at the index "+index.getAsInt());
        else
            System.out.println("No such element found");

    }

    public static void getElement(String element){
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");

        Optional<String> index = fruits.stream()
                .filter(x -> x.equalsIgnoreCase(element))
                .findFirst();

        index.ifPresentOrElse(
                fruit -> System.out.println("Found: "+fruit),
                ()-> System.out.println("Not Found: "+element)
        );
    }

    public static void main(String[] args) {
        getElement("Date");
    }
}
