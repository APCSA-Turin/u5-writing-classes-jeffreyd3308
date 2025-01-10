package U5T7_Part1;

public class Nums {
    private int int1;
    private int int2;
    private int objectTotal;
    private static int classTotal = 0;

    public Nums(int first, int second) {
        int1 = first;
        int2 = second;
        objectTotal = 0;
    }

    public int randBetween() {
        objectTotal++;
        classTotal++;
        return (int) (Math.random() * (int2 - int1 + 1)) + int1;
    }

    public int getRandomNumsGenerated() {
        return objectTotal;
    }

    public static int getTotalRandomNumsGenerated() {
        return classTotal;
    }
}
