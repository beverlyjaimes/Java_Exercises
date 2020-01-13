package Encapsulation;

public class Student {
//    will not be shown to the user need to be private
    private String name;
    private int age;

//    no static, static means you dont have to make an object to create a method

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}


