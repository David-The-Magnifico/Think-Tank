import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args){
	Scanner magnifico = new Scanner(System.in);

	
	System.out.println("Enter Width of a Rectangle");
	double width = magnifico.nextDouble();

	System.out.println("Enter Height of a Retangle");
	double height = magnifico.nextDouble();

	double perimeter = 2 * width + 2 * height;
	double area = width * height;
	
	System.out.printf("Perimeter of a rectangle is: %.2f%n", perimeter);
        System.out.printf("Area of a rectangle is: %.2f%n", area);
	}
}