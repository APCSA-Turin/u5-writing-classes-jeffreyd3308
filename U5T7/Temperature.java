package U5T7;

public class Temperature {
    private double high;
    private double low;
    private String scale;

    public Temperature(double high, double low, String scale) {
        this.high = high;
        this.low = low;
        this.scale = scale;
        if (!this.scale.equals("F") && !this.scale.equals("C")) {
            this.scale = "F";
        }
    }

    public static double convertCtoF(double temp) {
        return (temp * (9.0/5.0)) + 32;
    }

    public static double convertFtoC(double temp) {
        return (temp - 32) / (9.0/5.0);
    }

    public void changeToC() {
        if (scale.equals("F")) {
            high = convertFtoC(high);
            low = convertFtoC(low);
            scale = "C";
        }
    }

    public void changeToF() {
        if (scale.equals("C")) {
            high = convertCtoF(high);
            low = convertCtoF(low);
            scale = "F";
        }
    }

    public String tempInfo() {
        return "High Temperature: " + high + " " + scale + "\n" + "Low Temperature: " + low + " " + scale;
    }
}
