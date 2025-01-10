package U5T7_Part1;

public class Words {
    private Words() {}

    public static boolean doesContain(String first, String second) {
        if (second.indexOf(first) != -1) {
            return true;
        } else {
            return false;
        }
    }

    public static void printReverse(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.substring(i, i + 1) + " ");
        }
        System.out.println();
    }
}
