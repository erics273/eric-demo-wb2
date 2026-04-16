package com.pluralsight;

public class PersonApp {

    public static void main(String[] args) {

        Person student1 = new Person("Eric", "Schwartz", 44, "male");
        Person student2 = new Person("Lovi", "lastName", 25, "male");

        student1.sayHello();
        student2.sayHello();

        student1.goToWork();
        student1.goToWork();

        student2.goToWork();
        student2.goToWork();
        student2.goToWork();

        System.out.println("Student 1's health is at: " + student1.getHealth());
        System.out.println("Student 2's health is at: " + student2.getHealth());

        student1.eat();
        student2.eat();

        System.out.println("Student 1's health is at: " + student1.getHealth());
        System.out.println("Student 2's health is at: " + student2.getHealth());

        Person student3 = new Person();
        student3.setFirstName("tk");
        student3.setLastName("whatever");
        student3.setAge(45);
        student3.setGender("Male");
        student3.setHealth(100);
        student3.sayHello();

        Person instructor = new Person("Gabe", "awesome", 85, "male" );


    }

}
