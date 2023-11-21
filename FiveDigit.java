import java.util.Scanner;

public class FiveDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of five digits: ");
	int digits = input.nextInt();

	int number1 = digits/10000;
	int remainder = digits % 10000;
	int number2 = remainder/1000;
	int remainder = remainder % 1000;
	int number3 = remainder1/100;
	int remainder = remainder1 % 100;
	int number4 = remainder2/10;
	int number4 = remainder2 % 10;

	System.out.printf("%d  %d  %d  %d  %d");
	}
}
	