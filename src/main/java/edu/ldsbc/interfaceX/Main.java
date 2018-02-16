package edu.ldsbc.interfaceX;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal pig = new Pig();

        System.out.printf(pig.speaks());

        List<Animal> list = new ArrayList();
        list.add(dog);
        list.add(cat);
    }

}
