package U5T7_Part1;

public class Runner {
    public static void main(String[] args) {
        FreeStyle obj1 = new FreeStyle("obj1");
        System.out.println(FreeStyle.getTotalObjects());
        FreeStyle obj2 = new FreeStyle("obj2");
        System.out.println(obj2.info());
        System.out.println(obj1.info());
    }
}
