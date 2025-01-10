public class Prism {
    private int length = 0;
    private int width = 0;
    private int height = 0;

    public Prism(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Prism(int len) {
        length = len;
        width = len;
        height = len;
    }

    public Prism() {
        length = (int) (Math.random() * 91) + 10;
        width = (int) (Math.random() * 91) + 10;
        height = (int) (Math.random() * 91) + 10;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String dimensions() {
        return "Length = " + length + "\nWidth = " + width + "\nHeight = " + height;
    }

    public int volume() {
        return length * width * height;
    }

    public int surfaceArea() {
        return (int) (2 * (length * width) + 2 * (width * height) + 2 * (height * length));
    }
}
