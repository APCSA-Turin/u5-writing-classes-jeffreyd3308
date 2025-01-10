public class Dice {
    private int numberOfSides = 0;
    private int recentRoll = 0;
    private int rolls = 0;

    public Dice(int sides) {
        numberOfSides = sides;
    }

    public int getSides() {
        return numberOfSides;
    }

    public int getRollValue() {
        return recentRoll;
    }

    public int getRollCount() {
        return rolls;
    }
    
    public void setSides(int newSides) {
        numberOfSides = newSides;
    }

    public void roll() {
        int random = (int) (Math.random() * numberOfSides) + 1;
        rolls++;
        recentRoll = random;
    }
}