package edu.ldsbc.Assignment7;

import java.util.List;

public abstract class Sorter implements Control {

    private String name;

    public abstract void sort(List<Integer> list);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}