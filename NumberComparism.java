import java.util.Scanner;

public class NumberComparism {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a Number: ");
	int number = input.nextInt();
	int square = number*number;

	if (number+square > 100){
	System.out.println("The number and it's square are greater than 100");}
	
	if (number+square < 100){
	System.out.println("The number and it's square is less than 100");}

	if (number+square == 100){
	System.out.println("The number and it's square are equal to 100");}

	if (number+square != 100){
	System.out.println("The number and it's square is not equal to 100");}









	}
}