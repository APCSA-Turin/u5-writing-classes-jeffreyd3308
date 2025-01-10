package U5T7_Part1;

public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private static int mostRecentEmployeeID = 100;
    private static int totalEmployeesCreated = 0;

    public Employee(String first, String last) {
        firstName = first;
        lastName = last;
        id = mostRecentEmployeeID;
        mostRecentEmployeeID++;
        totalEmployeesCreated++;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getID() {
        return id;
    }

    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;
    }

    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }

    public String employeeInfo() {
        return "--------------------------\n" + "Employee full name: " + getFullName() + "\nEmployee ID: " + getID() + "\nMost recent ID assigned: " + getMostRecentEmployeeID() + "\nTotal employees hired: " + getTotalEmployeesCreated() + "\n--------------------------";
    }
} 