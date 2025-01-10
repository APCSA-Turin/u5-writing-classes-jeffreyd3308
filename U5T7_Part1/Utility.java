package U5T7_Part1;

import java.util.Scanner;

public class Utility {
    private Utility() {}

    public static double convertCtoF(double temp) {
        return (temp * (9.0/5.0)) + 32;
    }

    public static double convertFtoC(double temp) {
        return (temp - 32) / (9.0/5.0);
    }

    //A
    private static String printer(double temp, String scale) {
        if (scale.equals("F")) {
            return "The new temperature is " + convertFtoC(temp) + scale + ".";
        } else {
            return "The new temperature is " + convertCtoF(temp) + scale + ".";
        }
    }

    public static void temperatureConverter() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a temperature: ");
        double temperature = scan.nextDouble();
        System.out.println("Enter a scale: ");
        String tempScale = scan.next();
        System.out.println(printer(temperature, tempScale));
        scan.close();
    }
}
