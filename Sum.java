import java.util.Scanner;

public class Sum {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("input first integer");
	int firstNumber = input.nextInt();
	System.out.print("input second integer");
	int secondNumber =input.nextInt();
	int result = firstNumber + secondNumber;
	System.out.print(" the sum of" + firstNumber + " " + secondNumber + " is " + result);
        }
        

}