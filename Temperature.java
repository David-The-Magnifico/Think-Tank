import java.util.Scanner;

public class Temperature{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Temperature in Celsius: ");
	double celsius = input.nextDouble();
	double farenheit = 9/5*celsius+32;
	
		System.out.printf("Conversion of celsius to farenheit is %.2f%n", farenheit);



	}

}