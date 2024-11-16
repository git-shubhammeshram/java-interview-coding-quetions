package AccentureQuetions;

public class CheckStringIsPalindrome {

    public static void show(String name){
        String revName = "";

        for(int i=name.length()-1; i>=0; i--)
            revName = revName+name.charAt(i);



        if(name.equals(revName)) /*Check a actual value inside the string and == check the reference of the variable inside the memory*/
            System.out.println("Palindrome String");

        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        show("mom");
    }
}
