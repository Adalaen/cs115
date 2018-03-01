package edu.ldsbc.Assignment5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<AnimalAudio> animalList = new ArrayList<>();

        Owner craig = new Owner("Craig", "Smith", "000", "guyAt@gmail");
        Owner bob = new Owner("Bob", "Smith", "000", "guyAt@gmail");
        Owner jon = new Owner("Jon", "Smith", "010", "guy22At@gmail");
        Owner Jil = new Owner("Jil", "Smith", "001", "g22At@gmail");
        Owner bob2 = new Owner("Bob", "Walter", "510", "gAt@gmail");

        animalList.add(new Cat("Cat", craig, Gender.Female, Size.Small));
        animalList.add(new Duck("Duck", jon, Gender.Female, true));
        animalList.add(new Dog("Dog", bob2, Gender.Female, false));

        animalList.add(new Dog("Nic", bob, Gender.Male, true));
        animalList.add(new Duck("L", jon, Gender.Female, true));
        animalList.add(new Cat("Isak", Jil, Gender.Male, Size.Small));

        animalList.add(new Dog("Jone", bob2, Gender.Male, true));
        animalList.add(new Cat("Nancy", bob, Gender.Female, Size.Small));
        animalList.add(new Duck("Plushy", jon, Gender.Female, false));

        animalList.add(new Duck("BigD", Jil, Gender.Male, false));
        animalList.add(new Dog("BigD", bob, Gender.Male, true));
        animalList.add(new Cat("BigC", Jil, Gender.Male, Size.Small));

        for (AnimalAudio aa: animalList){
            System.out.println(aa.sayMyName());
            System.out.println(aa.makeSound());
            System.out.println(aa.printOwner());
            System.out.println();
        }
    }

}
