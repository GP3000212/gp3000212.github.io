import java.util.Scanner;

public class ProjectPrototype {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("UNDERSTANDING SIMPLE ALGORITHMS");
        System.out.println("|Sort the 8 sentences by the first word. Use '-' to separate the words and capitalize.|");
        
        System.out.println(" ");

        System.out.println("Not valid? Go back to step 3.");
        System.out.println("End");
        System.out.println("Start");
        System.out.println("Ask user for email address.");
        System.out.println("Store response in the variable.");
        System.out.println("Create a variable to recieve the user's email address.");
        System.out.println("Clear the variable in case it's not empty.");
        System.out.println("Check response if email address is valid");

        String answer = scanner.nextLine().trim();

        if (answer.equalsIgnoreCase("Start-Create-Clear-Ask-Store-Check-Not-End")) {
            System.out.println("You just made an algorithm!");
        } else {
            System.out.println("Try again!");
            }

        scanner.close();
    }
}