import java.util.Scanner;

public class Multiplicate {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first Value: ");
	int x = input.nextInt();

	System.out.print("Enter second Value: ");
	int y = input.nextInt();

	System.out.print("Enter third Value: ");
	int z = input.nextInt();

	int product = x*y*z;
	
	System.out.printf("Product is %d%n", product);

	}
}