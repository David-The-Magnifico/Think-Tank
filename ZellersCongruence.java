import java.util.Scanner;

public class ZellersCongruence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter month(1-12): ");
        int month = input.nextInt();

	System.out.print("Enter the day of the month(1-31): ");
        int day = input.nextInt();
        
	if (month == 1) {
            month = 13;
            year--;
        }
        else if (month == 2) {
            month = 14;
            year--;
	}

	int q = day;
        int m = month;
        int j = year / 100;
        int k = year % 100;
        int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

	String dayOfWeek;
        switch (h) {
            case 0:
                dayOfWeek = "Saturday";
                break;
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            default:
                dayOfWeek = "Invalid day";
                break;
	 }
        System.out.println("Day of the week is " + dayOfWeek);
       
    }

}