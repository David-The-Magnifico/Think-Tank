import java.util.Scanner;

public class Bite {
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int number = inputCollector.nextInt();

		if (number == 0){ System.out.println("1");
		} 
		else
		if (number == 1){ System.out.println("0");
		}
	}
}