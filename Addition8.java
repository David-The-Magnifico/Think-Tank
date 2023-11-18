import java.util.Scanner;

public class Addition8 {

	public static void main(String[] args) {	
   
    Scanner input = new Scanner(System.in);
   
    System.out.print("Enter first:");

    int number1 = input.nextInt();
   
    System.out.print("Enter second interger;");
   
       int number2 = input.nextInt();

      int sum = number1 + number2;
System.out.printf("sum is %d%n",sum);
 }
}
	