package AccentureQuetions;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        Integer[] numbers = {5, 3, 9, 1, 7};

        // Finding the second largest element using Stream API and Comparator
        Integer secondLargest = Arrays.stream(numbers)
                .distinct() // Remove duplicates
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1) // Skip the largest element
                .findFirst() // Get the second largest
                .orElse(null); // Return null if not found

        // Output the second largest element
        if (secondLargest != null) {
            System.out.println("Second largest element: " + secondLargest);
        } else {
            System.out.println("No second largest element found.");
        }
    }
}

