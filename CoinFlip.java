import java.util.Scanner;
import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {
        Random random = new Random();
        int coin = random.nextInt(2);

        Scanner input = new Scanner(System.in);
        System.out.print("Guess the coin flip! Enter 0 for heads or 1 for tails: ");
        int guess = input.nextInt();

        if (guess == coin) {
            System.out.println("Congratulations! Your guess is correct.");
        } else {
            System.out.println("Sorry, your guess is incorrect. Try again next time.");
        }
    }
}