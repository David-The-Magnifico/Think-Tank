import java.util.Scanner;

public class Conversion{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Input Value in Feet: ");

	double feet = input.nextDouble();
	double constant = 0.305;

	double result = feet*constant;
	
	System.out.printf("%.3f In Meter is: %.6f%n ",feet,result);

	}


}