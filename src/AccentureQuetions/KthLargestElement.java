package AccentureQuetions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KthLargestElement {

    public static int getKthLargestElement(int[] numbers, int x){
        Arrays.sort(numbers);
        return numbers[numbers.length-x];
    }

    public static void main(String[] args) {

        int kthLargestElement = getKthLargestElement(new int[]{1, 2, 3, 4, 5, 6}, 2);

        System.out.println(kthLargestElement);

    }

}
