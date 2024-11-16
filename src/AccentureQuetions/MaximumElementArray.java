package AccentureQuetions;

public class MaximumElementArray {

    public static void show(int [] number){
        int max = number[0];

        for(int i=1; i<number.length; i++){
            if(number[i]>max)
                max =number[i];
        }

        System.out.println("Maximum Element:- "+max);
    }

    public static void main(String[] args) {
        show(new int[]{5, 2, 9, 1, 7});
    }

}
