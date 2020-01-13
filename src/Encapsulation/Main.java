package Encapsulation;

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("Joe");
        s.setAge(5);

        System.out.println("s.name = " + s.name);
        System.out.println("s.age = " + s.age);
    }
}
