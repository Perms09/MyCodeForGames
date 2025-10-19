package IntermediateProgrammingJava;

import java.util.Arrays;

public class SelectionSorter {

    static void sortedNumbers(int []arr){
        for (int num : arr)
            System.out.print(num + " ");

    }
    static void selectionSort(int[] arr) {
        int n = arr.length;
        //Simulation Start
        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
                int temp = arr[j];
                arr[j] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }
    }











    public static void main(String[] args) {
        int []arr = {10,7,9};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Original array: ");
        selectionSort(arr);
        System.out.println("\nSorted Array: ");
        sortedNumbers(arr);

    }
}

/*
Start
print Original array {10, 7, 9}
print sorted array
int i = 0 n = arr.length
0 < 2; i++ min_idx = 0;
j = 1; 1 < 3; j++; arr[1](7) < arr[0](10) true; min_idx = j;
int temp = arr[1](7); arr[1] = arr[min_idx]; arr[min_idx] = temp; { 7, 10, 9}
int i = 1 n = arr.length
1 < 2; i++ min_idx = 1;
j = 2; 2 < 3; j++; arr[j(2)](9) < arr[min_idx(1)](10) false;
int temp = arr[2](9); arr[2](9) = arr[min_idx](10); arr[min_idx(1)] = temp; { 7, 9, 10}
int i = 2 n = arr.length
2 < 2 false; call sortedNumbers
 */