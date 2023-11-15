package task03;

import java.util.Scanner;

public class Main {

    static int score;
    static int grade;

    public static void main(String[] args) {

        Scanner scannerProduct = new Scanner(System.in);
        System.out.print("Please, enter the number of points for the product: ");
        score = scannerProduct.nextInt();
        scannerProduct.nextLine();

        if (score < 10) {
            System.out.println("Product without a rating...");
        } else if (score >= 10 & score < 20) {
            grade = 1;
            System.out.println("Product rating is " + grade + ".");
        } else if (score >= 20 & score < 30) {
            grade = 2;
            System.out.println("Product rating is " + grade + ".");
        } else if (score >= 30 & score < 40) {
            grade = 3;
            System.out.println("Product rating is " + grade + ".");
        } else if (score >= 40 & score < 50) {
            grade = 4;
            System.out.println("Product rating is " + grade + ".");
        } else {
            grade = 5;
            System.out.println("Product rating is " + grade + ".");
        }

        scannerProduct.close();
    }
}
