import java.util.Scanner;

public class Miles {
	public static void main(String[] args){
		final double KILOMETERS_PER_MILES = 1.609;

		Scanner input = new Scanner(System.in);

		System.out.print("Value in miles: ");
		double miles = input.nextDouble();

		double kilometers = miles * KILOMETERS_PER_MILES;

		System.out.printf("Miles to Kilometers is %.2f%n",kilometers);
	}
}