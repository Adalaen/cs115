package edu.ldsbc.Assignment5;

enum Gender {Male, Female}

public abstract class Animal implements AnimalAudio {

    private String myName;
    private Owner owner;
    private Gender gender;

    public Animal(String myName, Owner owner, Gender gender) {
        this.myName = myName;
        this.owner = owner;
        this.gender = gender;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}
