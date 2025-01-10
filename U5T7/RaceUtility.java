package U5T7;

public class RaceUtility {
    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    public static String makeProper(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
