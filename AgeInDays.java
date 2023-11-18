import java.util.Scanner;

public class AgeInDays {
	public static void main(String[] args){
	Scanner magnifico = new Scanner(System.in);

	System.out.println("Enter your age: ");
	int age = magnifico.nextInt();
	
	int year = 365;
	int days = age*365;
	System.out.printf("Age in days is %d%n", days);

	}
}