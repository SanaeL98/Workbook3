import java.util.Scanner;

public class FamousQuotesApp {
    public static void main(String[] args) {
        String[] quotes = {
            "Be yourself; everyone else is already taken.",
            "The only limit to our realization of tomorrow is our doubts of today.",
            "In the middle of every difficulty lies opportunity.",
            "Life is what happens when you're busy making other plans.",
            "Don't cry because it's over, smile because it happened.",
            "Success is not final, failure is not fatal.",
            "The purpose of our lives is to be happy.",
            "Turn your wounds into wisdom.",
            "Keep your face toward the sunshine, and shadows will fall behind you.",
            "Happiness depends upon ourselves."
        };

        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("Choose a number between 1 and 10 to see a quote.");
            System.out.println("Or type 0 to see a random quote:");

            try {
                int choice = scanner.nextInt();

                if (choice == 0) {
                    int randomIndex = (int)(Math.random() * 10);
                    System.out.println("Random Quote: " + quotes[randomIndex]);
                } else if (choice >= 1 && choice <= 10) {
                    System.out.println("Quote: " + quotes[choice - 1]);
                } else {
                    System.out.println("Invalid number. Please choose 1 to 10 or 0 for random.");
                }

            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
                scanner.next(); // clear wrong input
            }

            System.out.println("Do you want to see another quote? (yes/no)");
            String again = scanner.next();

            if (!again.equalsIgnoreCase("yes")) {
                keepGoing = false;
            }
        }

        System.out.println("Thank you for using FamousQuotes!");
    }
}





