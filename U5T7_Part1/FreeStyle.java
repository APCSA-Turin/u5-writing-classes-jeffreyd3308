package U5T7_Part1;

public class FreeStyle {
    private static int totalObjects = 0;
    public String attribute;

    public FreeStyle(String attribute) {
        this.attribute = attribute;
        totalObjects++;
    }

    public static int getTotalObjects() {
        return totalObjects;
    }

    public String info() {
        return attribute + " has " + totalObjects + " similar objects.";
    }
}
