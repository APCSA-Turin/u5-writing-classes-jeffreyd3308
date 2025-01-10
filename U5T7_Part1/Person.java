package U5T7_Part1;

public class Person {
    private boolean vaccinated;
    private String name;

    public Person(String name) {
        this.name = name;
        vaccinated = false;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void vaccine() {
        vaccinated = true;
    }

    public String getName() {
        return name;
    }
 }
