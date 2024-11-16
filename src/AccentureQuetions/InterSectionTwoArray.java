package AccentureQuetions;

import java.util.ArrayList;

public class InterSectionTwoArray {

    public static  void show(int[] array_1, int[] array_2){
        ArrayList<Number> list = new ArrayList<>();

        for (int a : array_1) {
            for (int b : array_2) {
                if (a == b) {
                    list.add(a);
                    break;
                }
            }
        }

        System.out.println("Intersected Element:- "+list);
    }

    public static void main(String[] args) {
        show(new int[]{1,2,3,4,5},new int[]{3,4,5,6,7});
    }
}
