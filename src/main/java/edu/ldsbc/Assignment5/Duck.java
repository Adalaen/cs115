package edu.ldsbc.Assignment5;

public class Duck extends Animal implements AnimalAudio {

    private boolean wingsClipped;

    public Duck(String myName, Owner owner, Gender gender, boolean wingsClipped) {
        super(myName, owner, gender);
        this.wingsClipped = wingsClipped;
    }

    public boolean isWingsClipped() {
        return wingsClipped;
    }

    public void setWingsClipped(boolean wingsClipped) {
        this.wingsClipped = wingsClipped;
    }

    public String makeSound() {
        return "The Duck Says Quack";
    }

    public String sayMyName() {
        return ("My Name is" + super.getMyName());
    }

}
