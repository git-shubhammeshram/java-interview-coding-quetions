package Debugging;

public class SampleCode {
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};
		int display = display(array);
		System.out.println(display);
	}

	public static int display(int[] array){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
            sum += array[i];
            System.out.println(array[i]);
        }
		sum = sum + 5;
	    return sum;
	}
}
