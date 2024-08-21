import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void playRound() {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 3;

        Scanner scanner = new Scanner(System.in);

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess (1-100): ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You found the number in " + attempts + " attempts.");
                return;
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Game over! The number was " + numberToGuess + ".");
    }

    public static void playGame() {
        int rounds = 0;
        int totalAttempts = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            rounds++;
            playRound();
            System.out.print("Play again? (y/n): ");
            String playAgain = scanner.next();

            if (playAgain.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Game over! You played " + rounds + " rounds.");
    }

    public static void main(String[] args) {
        playGame();
    }
}