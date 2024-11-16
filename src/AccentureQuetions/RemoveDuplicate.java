package AccentureQuetions;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {

    public static void show(int[] number){
        HashSet<Integer> set = new HashSet<>();

        for(int x:number)
            set.add(x);

        Integer[] array = set.toArray(new Integer[0]);

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        show(new int[]{1, 2, 2, 3, 4, 4, 5});
    }
}
