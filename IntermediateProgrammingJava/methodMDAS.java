package IntermediateProgrammingJava;

import java.util.Objects;
import java.util.Scanner;
public class methodMDAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input your 2 numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Input your operation");
        String oper1 = sc.nextLine();
        String result = String.valueOf(Objects.equals(oper1, "+") ? add(x, y) : Objects.equals(oper1, "-") ? subtract(x, y) : Objects.equals(oper1, "*")
                ? multiply(x, y) : Objects.equals(oper1, "/") ? divide(x, y) : Objects.equals(oper1, "%") ? modulo(x, y) : error());

        System.out.println(result);


    }
    //Calculator method
    public static int add(int x, int y){
        int z = x + y;
        System.out.println("Method used: Addition");
        return z;
    }
    public static int subtract(int x, int y){
        int z = x - y;
        System.out.println("Method use: Subtraction");
        return z;
    }
    public static int divide(int x, int y){
        int z = x / y;
        System.out.println("Method used: Division ");
        return z;
    }
    public static int multiply(int x, int y){
        int z = x * y;
        System.out.println("Method used: Multiplication");
        return z;
    }
    public static int modulo(int x, int y){
        int z = x % y;
        System.out.println("");
        return z;
    }


        public static Object error() {
            System.out.println("System crashed / Miss input Data ");
            return null;
        }


}
