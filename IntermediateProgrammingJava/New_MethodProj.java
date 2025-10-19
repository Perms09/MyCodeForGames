package IntermediateProgrammingJava;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class New_MethodProj {

    public static void main(String[] args) {

int [] arr = {5,32,432,32,654};
        System.out.println("Original Array: " + Arrays.toString(arr));
        try {
            int age = getInput();
            String result = age < 18 ? kid(age) : age > 18 ? adult(age) : defaul(age);
            System.out.println(result);
        } catch (InputMismatchException e){
            System.out.println("Error");

        }
    }

public static int getInput(){
Scanner sc = new Scanner(System.in);
    System.out.println("Age? ");
    return sc.nextInt();
    }

    public static String kid(int age){
        return "You are a kid" ;

    }
    public static String adult(int age){
        return "You are an adult";

    }
    public static String defaul(int age){
        return "unknown";

    }
    public static int array(int [] arr){
    return 21;

    }
}





