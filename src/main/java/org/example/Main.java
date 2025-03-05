package org.example;

public class Main {
    public static void main(String[] args) {
        //person instances:
        Person person1 = new Person("Jane", "Doe", 18);

        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());

        Person person2 = new Person("John", "Doe", 33, 2049, "teacher", "male");

        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Number: " + person2.getNumber());
        System.out.println("Title: " + person2.getTitle());
        System.out.println("Gender: " + person2.getGender());
        System.out.println("isTeen: " + person2.isTeen());

        //wall instances:
        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
