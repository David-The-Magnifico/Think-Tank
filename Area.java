import java.util.Scanner;

public class Area {

	public static void main(String[] arg){
  
	Scanner input = new Scanner(System.in);

	System.out.print("enter radius");

	double r = input.nextDouble();

	double dau = (r*r);
	double area = (3.14157 * dau );

	System.out.printf("Area of a circle is:" + area);
	}

}