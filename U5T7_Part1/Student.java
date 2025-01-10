package U5T7_Part1;

public class Student {
    private String name;
    private int points;
    private static int totalPoints = 0;
    private static int greatestPoints = 0;

    public Student(String name) {
        this.name = name;
        points = 0;
    }

    public String studentInfo() {
        return "Student: " + name + "\nStudent's Points: " + points;
    }

    public void addPoints(int amount) {
        points += amount;
        totalPoints += amount;
        if (points > greatestPoints) {
            greatestPoints = points;
        }
    }

    public static int getTotalPointsEarned() {
        return totalPoints;
    }

    public static int getGreatestPoints() {
        return greatestPoints;
    }

    public static String classInfo() {
        return "Total points earned by all students: " + totalPoints + "\nMost points earned by any student: " + greatestPoints;
    }
}
