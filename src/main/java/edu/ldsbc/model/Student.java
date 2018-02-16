package edu.ldsbc.model;

public class Student extends Person{

    public Student(String name, int age, float height) {
        super(name, age, height);
    }

    @Override
    public String printPerson() {
        return ("name=" + this.getName());
    }
}
