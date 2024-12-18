import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class DescendingOrderArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] arr = new Integer[10];

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Array in descending order:");
        for (int element : arr) {
            System.out.print(element);
        }

        scanner.close();
    }
}
