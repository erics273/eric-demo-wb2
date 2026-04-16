package com.pluralsight;

public class Person {

    //create the properties for this class
    //things that describe a person
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int health;

    //the constructor
    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.health = 100;
    }

    public Person() {
    }

    //methods, the stuff a person can do
    public void sayHello(){
        System.out.println("Hi I'm " + this.firstName + ". Nice to meet you");
    }

    public void goToWork(){
        System.out.println(this.firstName + " went to work!");
        this.health -= 5;
    }

    public void eat(){
        System.out.println(this.firstName + " ate some food");
        this.health += 10;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
