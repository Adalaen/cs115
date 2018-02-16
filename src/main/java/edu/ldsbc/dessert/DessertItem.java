package edu.ldsbc.dessert;

public class DessertItem {
    private String name;

    public DessertItem(String name) {
        this.name = name;
    }

    public int calculateItemCost(){
        return 0;
    }

    public String toReceipt() {
        return "Name = " + name;
    }

    @Override
    public String toString() {
        return "DessertItem{" +
                "name='" + name + '\'' +
                '}';
    }
}
