import java.util.Scanner;

public class WorldPopulationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current world population: ");
        double currentPopulation = input.nextDouble();

        System.out.print("Enter the annual world population growth rate (in percentage): ");
        double growthRate = input.nextDouble() / 100;

        for (int years = 1; years <= 5; years++) {
            currentPopulation += currentPopulation * growthRate;
            System.out.printf("Estimated world population after %d year(s): %.0f\n", years, currentPopulation);
        }
    }
}
