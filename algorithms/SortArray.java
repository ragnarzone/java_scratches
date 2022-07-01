import java.sql.SQLOutput;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        // Create array of int
        int[] array = new int[] {90,23,5,109,12,67,34};

        // Sort array using Arrays class
        Arrays.sort(array);

        System.out.println("Elements of array sorted in ascending order: ");

        // Print array using for loop
        for (int j : array) {
            System.out.println(j);
        }
    }
}
