public class AnotherPerson {
    private String name;
    private int age;
  
    public AnotherPerson(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    public String getName() {
      return name;
    }
  
    public int getAge() {
      return age;
    }
  
    public void introduce() {
      System.out.println("My name is " + name + " and I am " + age + " years old");
    }
  }
  
