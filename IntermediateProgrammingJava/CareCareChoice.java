package IntermediateProgrammingJava;

import java.util.Scanner;
public class CareCareChoice {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Define the services and their corresponding prices
            String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
            int[] prices = {25, 22, 15, 5};

            // Prompt user for input
            System.out.print("Enter the service you need (oil change, tire rotation, battery check, brake inspection): ");
            String userInput = sc.nextLine().toLowerCase();

            boolean found = false;

            // Check if input matches a service
            for (int i = 0; i < services.length; i++) {
                if (userInput.equals(services[i])) {
                    System.out.println("Service: " + services[i] + " - Price: $" + prices[i]);
                    found = true;
                    break;
                }
            }

            // If service is not found, display error
            if (!found) {
                System.out.println("Error: Invalid service entered.");
            }

            sc.close();
        }
    }
