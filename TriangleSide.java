import java.util.Scanner;

public class TriangleSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for 1st side: ");
        int side1 = input.nextInt();

        System.out.print("Enter value for 2nd side: ");
        int side2 = input.nextInt();

	System.out.print("Enter value for 3rd side: ");
        int side3 = input.nextInt();

	if (side1 + side2 > side3) {
            System.out.println("Valid!!");
        } else if (side2 + side3 > side1) {
            System.out.println("Valid!!");
        } else if (side1 + side3 > side2) {
            System.out.println("Valid!!");
	}

	int perimeter = side1 + side2 + side3;

	System.out.println("Perimeter of the triangle is: " + perimeter);
        
	}
}