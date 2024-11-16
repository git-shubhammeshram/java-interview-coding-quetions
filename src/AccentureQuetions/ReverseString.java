package AccentureQuetions;

public class ReverseString {

    public static void show(String name){
        String revVariable = "";

        for(int i=name.length()-1; i>=0; i--)
            revVariable = revVariable + name.charAt(i);


        System.out.println("Original String:- "+name);
        System.out.println("Reversed String:- "+revVariable);

    }

    public static void show(int number){
       int revNumber = 0;
       int temp;
       int original = number;
       while(number!=0){
           temp = number%10; /*Extract the last element*/
           revNumber = revNumber * 10 + temp; /*Build a reverse number*/
           number = number/10; /*Removing last digit*/
       }

        System.out.println("Original Number:- "+original);
        System.out.println("Reversed Number:- "+revNumber);
    }


    public static void show(String name,int number){
        String revName = new StringBuilder(name).reverse().toString();
        int revNumber = Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());

        System.out.println("Original String:- "+name+" "+"Original Integer:- "+name);
        System.out.println("Reverse String:- "+revName+" "+"Reverse Integer:- "+revNumber);
    }

    public static void main(String[] args) {

        show("Shubham");
        show(12345);

        show("Shubham",12345);
    }

}
