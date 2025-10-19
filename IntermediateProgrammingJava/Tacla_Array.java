package IntermediateProgrammingJava;

import java.util.Scanner;
public class Tacla_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        while (size <= 0) {
            System.out.println("Invalid! It must be greater than 0!");
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
        }

        sc.nextLine();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers separated by spaces:");
        String[] input = sc.nextLine().split(" ");

        System.out.print("Your Elements");
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(input[i]);
            System.out.print("  " + numbers[i]);

        }
        System.out.println();

        int total = 0;
        for (int numb : numbers) {
            total += numb;
        }
        System.out.println("Your Total Numbers:  " + total);
        System.out.println("Your Average Numbers:  " + total / numbers.length);

        int max = numbers[0];
        int min = numbers[0];
        for (int numbr : numbers) {
            if (numbr > max) {
                max = numbr;
            }
            if (numbr < min) {
                min = numbr;
                System.out.print("Minimum: " + min);
                System.out.print("Maximum: " + max);
            }
        }
    }
}


