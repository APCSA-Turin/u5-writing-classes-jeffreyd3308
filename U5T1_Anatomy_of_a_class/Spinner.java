public class Spinner {
    private int value = 0;
    private int count = 0;
    private int sum = 0;
    private int sections = 0;

    public Spinner(int sections) {
        this.sections = sections;
    }

    public int getSpinValue() {
        return value;
    }

    public int getSpinCount() {
        return count;
    }

    public int getSpinSum() {
        return sum;
    }

    public void spin() {
        int random = (int) (Math.random() * sections) + 1;
        value = random;
        count++;
        sum += value;
    }

    public double averageSpin() {
        return (double) sum / count;
    }
}
