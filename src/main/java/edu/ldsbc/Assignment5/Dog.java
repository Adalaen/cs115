package edu.ldsbc.Assignment5;

public class Dog extends Animal implements AnimalAudio {

    private boolean tail;

    public Dog(String myName, Owner owner, Gender gender, boolean tail) {
        super(myName, owner, gender);
        this.tail = tail;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public String makeSound() {
        return "The Dog Says Woof";
    }

    public String sayMyName() {
        return ("My Name is " + super.getMyName());
    }

    public String printOwner() {
        return ("My owner is: "+getOwner().getFirstName()+" "+getOwner().getLastName());
    }

}
