 
//write a program to accept 10 number and store in a array and print the sum of all numbers which are divisible by 5 only 

import java.util.Scanner;

public class PrintArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 5 == 0) {
                sum += numbers[i];
            }
        }

        System.out.println("Sum: " + sum);
    }
}
