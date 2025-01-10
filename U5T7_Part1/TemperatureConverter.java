package U5T7_Part1;

public class TemperatureConverter {
    private double temp;
    private String scale;

    public TemperatureConverter(double temp, String scale) {
        this.temp = temp;
        this.scale = scale;
    }

    public double getTemp() {
        return temp; //B
    }

    public String getScale() {
        return scale;
    }

    private String converter() {
        if (scale.equals("F")) {
            return "The new temperature is " + Utility.convertFtoC(temp) + scale + ".";//E
        } else {
            return "The new temperature is " + Utility.convertCtoF(temp) + scale + ".";
        }
    }

    public static void equation() {
        System.out.println("The equation to convert temperature is F = 9/5 C + 32");
    }

    public void info() {
        equation();//D
        System.out.println(converter());//C
    }

    public void start() {
        equation();
        System.out.println(converter());
        Utility.temperatureConverter();
    }
}
