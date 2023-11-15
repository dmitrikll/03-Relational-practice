package task02;

import java.util.Scanner;

public class Main {

    static String trafficLight;

    public static void main(String[] args) {

        Scanner scannerTraffic = new Scanner(System.in);

        System.out.print("Please, enter the traffic light (red; yellow; green): ");
        trafficLight = scannerTraffic.nextLine();

        switch (trafficLight) {
            case "red":
                System.out.println("Please, stand still.");
                break;
            case "yellow":
                System.out.println("Please, stand by.");
                break;
            case "green":
                System.out.println("GO !!!");
            default:
                System.out.println("Traffic lights do not work...");

        }

        scannerTraffic.close();
    }

}
