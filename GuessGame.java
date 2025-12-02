import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int number = rand.nextInt(100) + 1;
        int guess;

        System.out.println("Guess a number between 1 and 100:");

        do {
            guess = sc.nextInt();
            if (guess > number) {
                System.out.println("Too high! Try again:");
            } else if (guess < number) {
                System.out.println("Too low! Try again:");
            } else {
                System.out.println("Correct! The number was " + number);
            }
        } while (guess != number);
    }
}

    

