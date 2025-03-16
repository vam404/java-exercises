import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    public static void main (String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");

            // Convert String[] to ArrayList<Integer>
            ArrayList<Integer> arr = new ArrayList<Integer>();

            // Add only integers to the ArrayList
            for (String s : inputArr) {
                try {
                    arr.add(Integer.parseInt(s));
                } catch (NumberFormatException e) {
                    // Skip if the string is not an integer
                }
            }

            // Convert ArrayList to int[]
            int[] arrInt = arr.stream().mapToInt(Integer::intValue).toArray();

            // Sort the array
            int[] sortedArr = Utils.Util.mergesort(arrInt);

            // Print the smallest element
            System.out.println(sortedArr[0]);
        }
    }
}
