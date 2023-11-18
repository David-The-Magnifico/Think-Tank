import java.util.Scanner;

public class Acceleration{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("What is the Initial Velocity?: ");
	int initialVelocity = input.nextInt();

	System.out.print("What is the Final Velocity?: ");
	int finalVelocity = input.nextInt();

	System.out.print("What is the Total Time Travelled?: ");
	int totalTime = input.nextInt();

	int acceleration = (finalVelocity - initialVelocity)/totalTime;
	
	System.out.printf("The Average Acceleration is: %d%n",acceleration);


	}


}