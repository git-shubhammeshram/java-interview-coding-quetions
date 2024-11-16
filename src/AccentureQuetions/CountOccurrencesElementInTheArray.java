package AccentureQuetions;

import java.util.HashMap;

public class CountOccurrencesElementInTheArray {

    public static void getOccurrence(int[] number){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x:number)
            map.put(x,map.getOrDefault(x,0)+1);

        for(int x:map.keySet())
            System.out.println("Element - "+ x +" occurs "+ map.get(x)+ " times ");
    }

    public static void main(String[] args) {

        getOccurrence(new int[]{1,2,3,3,1,2,4,5,5,6});
    }
}
