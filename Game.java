import java.util.Scanner;

public class Game{
	public static void main(String[] args){
		Scanner magnifico = new Scanner(System.in);

		System.out.print("Enter playerA name: ");
		String playerA  = magnifico.nextLine();

		System.out.print("Enter playerB name: ");
		String playerB = magnifico.nextLine();

		System.out.print(playerA + " enter a number 0, 1, or 2: ");
        	int player1 = magnifico.nextInt();
		while (player1 < 0 || player1 > 2) {
            System.out.print("Invalid input. Please enter 0, 1, or 2: ");
            player1 = magnifico.nextInt();
		 }

       	 System.out.print(playerB + " enter a number 0, 1, or 2: ");
        	int player2 = magnifico.nextInt();
       	 while (player2 < 0 || player2 > 2) {
            System.out.print("Invalid input. Please enter 0, 1, or 2: ");
            player2 = magnifico.nextInt();
       	 }

       	 if (player1 == player2) {
            System.out.println("It's a draw!");
       	 } else if ((player1 - player2 + 3) % 3 == 1) {
            System.out.println(player1 + " won " + player2);
       	 } else {
            System.out.println(player2 + " won " + player1);
		}
	}

}