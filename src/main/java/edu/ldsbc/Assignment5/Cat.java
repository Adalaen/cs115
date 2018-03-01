package edu.ldsbc.Assignment5;

enum Size {Small, Medium, Large}

public class Cat extends Animal implements AnimalAudio {

    private Size size;

    public Cat(String myName, Owner owner, Gender gender, Size size) {
        super(myName, owner, gender);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String makeSound() {
        return "The Cat Says Meow";
    }

    public String sayMyName() {
        return ("My Name is " + super.getMyName());
    }

    public String printOwner() {
        return ("My owner is: "+getOwner().getFirstName()+" "+getOwner().getLastName());
    }

}
