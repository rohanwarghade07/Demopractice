
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        int[] arr = new int[10];

       
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        
        System.out.println("Array in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(arr[i]);
        }

     
        scanner.close();
    }
}
