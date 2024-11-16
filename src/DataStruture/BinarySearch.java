package DataStruture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

    public static void getElement(int target){

        List<Integer> numbers = Arrays.asList(
                34, 12, 9, 75, 58, 19
        );

        List<Integer> sortedNumber = numbers.stream()
                .sorted()
                .toList();

        int index = Collections.binarySearch(sortedNumber, target);

        if(index>=0)
            System.out.println("Element present at index : "+index);
        else
            System.out.println("No such element found");

        }
    public static void getElement(String element){
        List<String> words = Arrays.asList(
          "Shubham","Rahul","Sneha","Karan","Divya"
        );

        List<String> sortedWords = words.stream()
                .sorted()
                .toList();
        int index = Collections.binarySearch(sortedWords, element);

        if(index>=0)
            System.out.println("Word present at index : "+index);
        else
            System.out.println("No such word found");
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Press 1.Integer Element 2.String Elements 3.Exit");
            int choice = scan.nextInt();
            if(choice == 3) break;

            switch (choice){
                case 1:
                    System.out.println("Enter the number");
                    int number = scan.nextInt();
                    getElement(number);
                    break;
                case 2:
                    System.out.println("Enter the string");
                    String word = scan.next();
                    getElement(word);
                    break;
                default:
                    System.out.println("Enter valid response");
            }
        }

    }
    }
