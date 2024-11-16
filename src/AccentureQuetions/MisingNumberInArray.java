package AccentureQuetions;

public class MisingNumberInArray {

    /*
    * n(n+1)
    * -------
    *   2
    * */

    public static void display(int[] number){
        int n = number.length+1;
        int totalSum = n * (n+1) / 2 ;

        int arraySum = 0;
        for(int x:number)
            arraySum = arraySum+x;

        int missingNumber = totalSum - arraySum;

        System.out.println(missingNumber);

    }

    public static void main(String[] args) {
        display(new int[]{1,2,4,5,6});
    }
}
