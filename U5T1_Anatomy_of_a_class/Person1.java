public class Person1 {
    private int meetings = 0;
    private String first = "";
    private String last = "";

    public Person1(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public int getMeetings() {
        return meetings;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public void setMeetings() {
        meetings++;
    }

    public void meet(Person person) {
        System.out.println("Hello, my name is " + first);
        System.out.println("Hi, my name is " + person.getFirst());
        meetings++;
        person.setMeetings();
    }
}
