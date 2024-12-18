import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] sumArray = new int[10];
        
        for (int i = 0; i < 10; i++) {
            array1[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            array2[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            sumArray[i] = array1[i] + array2[i];
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.print(sumArray[i] + " ");
        }
        
        scanner.close();
    }
}
