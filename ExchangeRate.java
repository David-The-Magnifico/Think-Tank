import java.util.Scanner;

public class ExchangeRate {
	public static void main(String[] args){
	Scanner magnifico = new Scanner(System.in);

	
	System.out.println("Enter amount in USD");
	double amount = magnifico.nextDouble();

	double rmb = 6.81;
	double usdToRmb = amount*6.81;
	
	System.out.printf("Exchange Rate from USD to RMB is %.2f%n", usdToRmb);
		
	System.out.println("\nEnter amount in RMB");
	double amount2 = magnifico.nextDouble();

	double usd = 10000.00;
	double rmbToUsd = amount*10000.00;
	
	System.out.printf("Exchange Rate from RMB to USD is %.2f%n", rmbToUsd);
	
	}
}	
	