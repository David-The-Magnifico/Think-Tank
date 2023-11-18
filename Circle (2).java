import java.util.Scanner;

public class Circle {
	public static void main(String[] args){
	Scanner magnifico = new Scanner(System.in);

	
	System.out.println("Enter Radius of a Circle");
	double Radius = magnifico.nextDouble();

	double pi = 3.142;
	double perimeter = 2 * Radius * 3.142;
	double area = Radius * Radius * 3.142;
	
	System.out.printf("Perimeter of a circle is: %.2f%n", perimeter);
        System.out.printf("Area of a Circle is: %.2f%n", area);
	}
}