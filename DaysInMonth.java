import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        
        if(month == 1){
	 System.out.println(year+" January has 31 days");
	}
	if(month == 2 && (year % 4) == 0){
	System.out.println(year+" February has 29 days");
	}else {
	System.out.println(year+" February has 28 days");
	}
	if(month == 3){
	System.out.println(year+" March has 31 days");
	}
	if(month == 4){
	System.out.println(year+" April has 30 days");
	}
	if(month == 5){
	System.out.println(year+" May has 31 days");
	}
	if(month == 6){
	System.out.println(year+" June has 30 days");
	}
	if(month == 7){
	System.out.println(year+" July has 31 days");
	}
	if(month == 8){
	System.out.println(year+" August has 31 days");
	}
	if(month == 9){
	System.out.println(year+" September has 30 days");
	}
	if(month == 10){
	System.out.println(year+" October has 31 days");
	}
	if(month == 11){
	System.out.println(year+" November has 30 days");
	}
	if(month == 12){
	System.out.println(year+" December has 31 days");
	}


	}
}
