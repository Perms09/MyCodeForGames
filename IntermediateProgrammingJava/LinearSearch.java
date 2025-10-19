package IntermediateProgrammingJava;

import java.util.Scanner;
import java.util.InputMismatchException;

public class LinearSearch {

    // Binary search
    static int binarySearch(int[] arr, int left, int right, int x) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
//Sort the numbers
    static int[] sortedArray(int[] arr) {
        int n = arr.length;
        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        return arr;
    }

//Printing sorted numbers
    static void sortedNumbers(int []arr){
        for (int num : arr)
            System.out.print(num + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Input elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // Sort the array once
        int[] sortedArr = sortedArray(arr);
        System.out.print("Current fixed array: ");
        sortedNumbers(sortedArr);
        System.out.println();

        while (true) {
            System.out.print("Enter number for searching or 0 to close program: ");
            try {
                int n = sc.nextInt();
                if (n == 0) {
                    System.out.println("Thank you! Have a great day.");
                    break;
                }

                int ans = binarySearch(sortedArr, 0, size - 1, n);
                System.out.println(ans == -1 ? "Not found" : "Element found at index: " + ans);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Clear buffer
            }
        }

        sc.close();
    }
}
