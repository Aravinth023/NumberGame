import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(10) + 1;
        int attempts = 3;

        
        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 10");
        System.out.println("You have 3 attempts\n");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("🎉 Congratulations! You guessed the correct number.");
                break;
            } else if (guess > secretNumber) {
                System.out.println("📉 Too high!");
            } else {
                System.out.println("📈 Too low!");
            }

            attempts--;
            System.out.println("Attempts left: " + attempts + "\n");
        }

        if (attempts == 0) {
            System.out.println("❌ Game Over! The correct number was: " + secretNumber);
        }

        scanner.close();
    }
}

    
