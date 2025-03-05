package org.example;

public class Person {
    //instance variables:
    String firstname;
    String lastname;
    int age;
    int number;
    String title;
    String gender;

    //constructors:
    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String lastname, int age, int number, String gender) {
        this(firstname, lastname, age);
        this.number = number;
        this.gender = gender;
    }
    public Person(String firstname, String lastname, int age, int number, String title, String gender) {
        this(firstname, lastname, age, number, gender);
        this.title = title;

    }

    //methods:
    public String getFirstName() {
        return this.firstname;
    }
    public String getLastName() {
        return this.lastname;
    }
    public int getAge() {
        return this.age;
    }
    public Boolean isTeen() {
        return this.age <= 19 && this.age >= 13;
    }
    public int getNumber() {
        return this.number;
    }
    public String getTitle() {
        return this.title;
    }
    public String getGender() {
        return this.gender;
    }

}
