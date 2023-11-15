package task01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static double salesAmount;
    static double bonusAmount;
    static double bonusRateMin;
    static double bonusRateMax;
    static double bonusRate;


    public static void main(String[] args) {

        bonusRateMin = 10000.00;
        bonusRateMax = 20000.00;

        Scanner scannerIncome = new Scanner(System.in);
        scannerIncome.useLocale(Locale.ENGLISH);

        System.out.print("Please, enter the amount of sales: ");
        salesAmount = scannerIncome.nextDouble();
        scannerIncome.nextLine();

        if (salesAmount <= bonusRateMin) {
            bonusRate = 10.00;
            bonusAmount = salesAmount * bonusRate / 100;
            System.out.printf("The bonus amount is: %.2f \n", bonusAmount);
        } else if (salesAmount > bonusRateMin & salesAmount <= bonusRateMax) {
            bonusRate = 15.00;
            bonusAmount = salesAmount * bonusRate / 100;
            System.out.printf("The bonus amount is: %.2f \n", bonusAmount);
        } else {
            bonusRate = 20.00;
            bonusAmount = salesAmount * bonusRate / 100;
            System.out.printf("The bonus amount is: %.2f \n", bonusAmount);
        }

        scannerIncome.close();
    }
}
