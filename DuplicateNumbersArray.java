import java.util.Scanner;
import java.util.HashSet;

public class DuplicateNumbersArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        HashSet<Integer> duplicateNumbers = new HashSet<>();

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();

            if (!uniqueNumbers.add(arr[i])) {
                duplicateNumbers.add(arr[i]);
            }
        }

        if (duplicateNumbers.isEmpty()) {
            System.out.println("No duplicate numbers found.");
        } else {
            System.out.println("Duplicate numbers:");
            for (int num : duplicateNumbers) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
