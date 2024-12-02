import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1, max = 100;
        int number = (int) (Math.random() * (max - min + 1) + min);
        int attempts = 5;
        boolean guessed = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between " + min + " and " + max + ". You have " + attempts + " attempts.");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts--;

            if (guess == number) {
                System.out.println("Congratulations! You guessed the correct number.");
                guessed = true;
                break;
            } else if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }

            System.out.println("Attempts left: " + attempts);
        }

        if (!guessed) {
            System.out.println("Sorry, you've run out of attempts. The number was: " + number);
        }
    }
}
