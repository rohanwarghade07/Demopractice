import java.util.Scanner;

public class NumberToDigitArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String numStr = Integer.toString(number);
        int[] digitArray = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digitArray[i] = Character.getNumericValue(numStr.charAt(i));
        }

        System.out.println("Array of digits:");
        for (int digit : digitArray) {
            System.out.println(digit);
        }

        scanner.close();
    }
}
