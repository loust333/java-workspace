import java.util.Scanner;

public class AmortizationCalculator {
  private static Scanner scanner = new Scanner(System.in);
  private static double monthlyRate;

  public static void main(String[] args){
    System.out.println("Please enter your total loan amount: ");
    double principal = scanner.nextDouble();
    System.out.println("Please enter your APR interest rate (format is 00.00):");
    double interest = scanner.nextDouble();
    System.out.println("Please enter your total amount of payments: ");
    int numberOfPayments = scanner.nextInt();

    monthlyRate = (double) interest / 1200;
    double amortization = calculate(principal, numberOfPayments);
    System.out.println("=====================================================");
    System.out.printf("Your periodic payment amount is %.4f\n", amortization);
    System.out.println("=====================================================");

  }

  private static double calculate(double principal, int numberOfPayments){
    double amortization = 0.00;

    if (monthlyRate > 0) {
      amortization = (principal * monthlyRate * Math.pow(1 + monthlyRate, (double)numberOfPayments)) /
                (Math.pow(1 + monthlyRate, (double)numberOfPayments) - 1);
    } else {
      amortization = principal / numberOfPayments;
    }
    return amortization;
  }
}
