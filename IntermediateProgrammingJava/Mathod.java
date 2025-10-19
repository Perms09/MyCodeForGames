package IntermediateProgrammingJava;

import java.util.Scanner;



public class Mathod {

    static void print(String word) {
        System.out.println(word);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number");
        int numb1 = sc.nextInt();
        int numb2 = sc.nextInt();

        int add = add(numb1, numb2);
        int sub = sub(numb1, numb2);
        int div = div(numb1, numb2);
        int mult = mult(numb1, numb2);

        System.out.println();

        print(result);
        print("Addition: " + add);
        print("Subtrraction: " + sub);
        print("Multiply: " + mult);
        print("Divide: " + div);


    }

    static String result = ("Results");
    static int add(int numb1, int numb2) {
        return numb1 + numb2;
    }
        static int sub(int numb1, int numb2){
            return numb1 - numb2;
        }
            static int div(int numb1, int numb2){
                return numb1 / numb2;
            }
                static int mult(int numb1, int numb2){
                return numb1 * numb2;
            }

    }


