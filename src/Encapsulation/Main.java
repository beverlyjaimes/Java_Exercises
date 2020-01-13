package Encapsulation;

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("Joe");
        s.setAge(5);
//age and name wont show up so we need to create get method
        System.out.println("s.name = " + s.getName());
        System.out.println("s.age = " + s.getAge());
    }
}
