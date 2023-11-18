import java.util.Scanner;

public class Circle{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("What is the Radius of the circle?: ");
	double radius = input.nextDouble();
	
	double pi = 3.14159;
	
	double diameter = 2*radius;
	double circumference = 2*pi*radius;
	double area = pi*radius*radius;
	System.out.printf("The diameter of the Circle is %.2f%nThe Circumference of the Circle is %.2f%nThe Area of the Circle is %.2f%n", diameter, circumference, area);



	}	

}