package StreamAPIQuestions;

public class ReverseString {

    public static void main(String[] args) {
        String country = "India";

        Integer count = 12345;

        String reverseString = new StringBuilder(country).reverse().toString();
        System.out.println(reverseString);

        int reverseInteger = Integer.parseInt(new StringBuilder(String.valueOf(count)).reverse().toString());
        System.out.println(reverseInteger);
    }
}
